// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecIngressRuleMatchPath;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecIngressRuleMatch {
    /**
     * @return Paths must start with `/` and must be unique within the app.
     * 
     */
    private @Nullable AppSpecIngressRuleMatchPath path;

    private AppSpecIngressRuleMatch() {}
    /**
     * @return Paths must start with `/` and must be unique within the app.
     * 
     */
    public Optional<AppSpecIngressRuleMatchPath> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecIngressRuleMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppSpecIngressRuleMatchPath path;
        public Builder() {}
        public Builder(AppSpecIngressRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder path(@Nullable AppSpecIngressRuleMatchPath path) {
            this.path = path;
            return this;
        }
        public AppSpecIngressRuleMatch build() {
            final var o = new AppSpecIngressRuleMatch();
            o.path = path;
            return o;
        }
    }
}