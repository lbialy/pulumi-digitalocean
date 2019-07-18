// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information on a DigitalOcean database cluster resource.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * 
 * // Create a new database cluster
 * const example = pulumi.output(digitalocean.getDatabaseCluster({
 *     name: "example-cluster",
 * }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/database_cluster.html.markdown.
 */
export function getDatabaseCluster(args: GetDatabaseClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseClusterResult> {
    return pulumi.runtime.invoke("digitalocean:index/getDatabaseCluster:getDatabaseCluster", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseCluster.
 */
export interface GetDatabaseClusterArgs {
    /**
     * The name of the database cluster.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getDatabaseCluster.
 */
export interface GetDatabaseClusterResult {
    /**
     * Name of the cluster's default database.
     */
    readonly database: string;
    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL).
     */
    readonly engine: string;
    /**
     * Database cluster's hostname.
     */
    readonly host: string;
    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     */
    readonly maintenanceWindows: { day: string, hour: string }[];
    readonly name: string;
    /**
     * Number of nodes that will be included in the cluster.
     */
    readonly nodeCount: number;
    /**
     * Network port that the database cluster is listening on.
     */
    readonly port: number;
    /**
     * DigitalOcean region where the cluster will reside.
     */
    readonly region: string;
    /**
     * Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     */
    readonly size: string;
    /**
     * The full URI for connecting to the database cluster.
     */
    readonly uri: string;
    /**
     * Username for the cluster's default user.
     */
    readonly user: string;
    /**
     * Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     */
    readonly version: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}