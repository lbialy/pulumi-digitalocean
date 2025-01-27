// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppSpecFunctionLogDestinationLogtail {
    /**
     * @return Logtail token.
     * 
     */
    private String token;

    private GetAppSpecFunctionLogDestinationLogtail() {}
    /**
     * @return Logtail token.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecFunctionLogDestinationLogtail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String token;
        public Builder() {}
        public Builder(GetAppSpecFunctionLogDestinationLogtail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public GetAppSpecFunctionLogDestinationLogtail build() {
            final var o = new GetAppSpecFunctionLogDestinationLogtail();
            o.token = token;
            return o;
        }
    }
}
