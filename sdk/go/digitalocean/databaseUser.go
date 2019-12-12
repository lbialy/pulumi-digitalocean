// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.
// 
// > **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/database_user.html.markdown.
type DatabaseUser struct {
	s *pulumi.ResourceState
}

// NewDatabaseUser registers a new resource with the given unique name, arguments, and options.
func NewDatabaseUser(ctx *pulumi.Context,
	name string, args *DatabaseUserArgs, opts ...pulumi.ResourceOpt) (*DatabaseUser, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["clusterId"] = nil
		inputs["name"] = nil
	} else {
		inputs["clusterId"] = args.ClusterId
		inputs["name"] = args.Name
	}
	inputs["password"] = nil
	inputs["role"] = nil
	s, err := ctx.RegisterResource("digitalocean:index:DatabaseUser", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &DatabaseUser{s: s}, nil
}

// GetDatabaseUser gets an existing DatabaseUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseUser(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DatabaseUserState, opts ...pulumi.ResourceOpt) (*DatabaseUser, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["clusterId"] = state.ClusterId
		inputs["name"] = state.Name
		inputs["password"] = state.Password
		inputs["role"] = state.Role
	}
	s, err := ctx.ReadResource("digitalocean:index:DatabaseUser", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &DatabaseUser{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *DatabaseUser) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *DatabaseUser) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The ID of the original source database cluster.
func (r *DatabaseUser) ClusterId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["clusterId"])
}

// The name for the database user.
func (r *DatabaseUser) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// Password for the database user.
func (r *DatabaseUser) Password() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["password"])
}

// Role for the database user. The value will be either "primary" or "normal".
func (r *DatabaseUser) Role() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["role"])
}

// Input properties used for looking up and filtering DatabaseUser resources.
type DatabaseUserState struct {
	// The ID of the original source database cluster.
	ClusterId interface{}
	// The name for the database user.
	Name interface{}
	// Password for the database user.
	Password interface{}
	// Role for the database user. The value will be either "primary" or "normal".
	Role interface{}
}

// The set of arguments for constructing a DatabaseUser resource.
type DatabaseUserArgs struct {
	// The ID of the original source database cluster.
	ClusterId interface{}
	// The name for the database user.
	Name interface{}
}