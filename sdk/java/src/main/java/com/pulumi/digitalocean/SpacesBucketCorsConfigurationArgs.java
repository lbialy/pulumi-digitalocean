// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.SpacesBucketCorsConfigurationCorsRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SpacesBucketCorsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpacesBucketCorsConfigurationArgs Empty = new SpacesBucketCorsConfigurationArgs();

    /**
     * The name of the bucket to which to apply the CORS configuration.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket to which to apply the CORS configuration.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    @Import(name="corsRules", required=true)
    private Output<List<SpacesBucketCorsConfigurationCorsRuleArgs>> corsRules;

    /**
     * @return Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    public Output<List<SpacesBucketCorsConfigurationCorsRuleArgs>> corsRules() {
        return this.corsRules;
    }

    /**
     * The region where the bucket resides.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region where the bucket resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private SpacesBucketCorsConfigurationArgs() {}

    private SpacesBucketCorsConfigurationArgs(SpacesBucketCorsConfigurationArgs $) {
        this.bucket = $.bucket;
        this.corsRules = $.corsRules;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpacesBucketCorsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpacesBucketCorsConfigurationArgs $;

        public Builder() {
            $ = new SpacesBucketCorsConfigurationArgs();
        }

        public Builder(SpacesBucketCorsConfigurationArgs defaults) {
            $ = new SpacesBucketCorsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket to which to apply the CORS configuration.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to which to apply the CORS configuration.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(Output<List<SpacesBucketCorsConfigurationCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<SpacesBucketCorsConfigurationCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(SpacesBucketCorsConfigurationCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param region The region where the bucket resides.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where the bucket resides.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public SpacesBucketCorsConfigurationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.corsRules = Objects.requireNonNull($.corsRules, "expected parameter 'corsRules' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
