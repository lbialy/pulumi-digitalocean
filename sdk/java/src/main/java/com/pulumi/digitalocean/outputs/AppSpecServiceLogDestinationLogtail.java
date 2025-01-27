// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppSpecServiceLogDestinationLogtail {
    /**
     * @return Logtail token.
     * 
     * A `database` can contain:
     * 
     */
    private String token;

    private AppSpecServiceLogDestinationLogtail() {}
    /**
     * @return Logtail token.
     * 
     * A `database` can contain:
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecServiceLogDestinationLogtail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String token;
        public Builder() {}
        public Builder(AppSpecServiceLogDestinationLogtail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public AppSpecServiceLogDestinationLogtail build() {
            final var o = new AppSpecServiceLogDestinationLogtail();
            o.token = token;
            return o;
        }
    }
}
