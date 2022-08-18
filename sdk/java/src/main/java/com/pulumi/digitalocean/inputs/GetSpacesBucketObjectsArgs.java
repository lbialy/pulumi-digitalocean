// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpacesBucketObjectsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpacesBucketObjectsArgs Empty = new GetSpacesBucketObjectsArgs();

    /**
     * Lists object keys in this Spaces bucket
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Lists object keys in this Spaces bucket
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * A character used to group keys (Default: none)
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return A character used to group keys (Default: none)
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
     * 
     */
    @Import(name="encodingType")
    private @Nullable Output<String> encodingType;

    /**
     * @return Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
     * 
     */
    public Optional<Output<String>> encodingType() {
        return Optional.ofNullable(this.encodingType);
    }

    /**
     * Maximum object keys to return (Default: 1000)
     * 
     */
    @Import(name="maxKeys")
    private @Nullable Output<Integer> maxKeys;

    /**
     * @return Maximum object keys to return (Default: 1000)
     * 
     */
    public Optional<Output<Integer>> maxKeys() {
        return Optional.ofNullable(this.maxKeys);
    }

    /**
     * Limits results to object keys with this prefix (Default: none)
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Limits results to object keys with this prefix (Default: none)
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The slug of the region where the bucket is stored.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The slug of the region where the bucket is stored.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetSpacesBucketObjectsArgs() {}

    private GetSpacesBucketObjectsArgs(GetSpacesBucketObjectsArgs $) {
        this.bucket = $.bucket;
        this.delimiter = $.delimiter;
        this.encodingType = $.encodingType;
        this.maxKeys = $.maxKeys;
        this.prefix = $.prefix;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpacesBucketObjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpacesBucketObjectsArgs $;

        public Builder() {
            $ = new GetSpacesBucketObjectsArgs();
        }

        public Builder(GetSpacesBucketObjectsArgs defaults) {
            $ = new GetSpacesBucketObjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Lists object keys in this Spaces bucket
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Lists object keys in this Spaces bucket
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param delimiter A character used to group keys (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter A character used to group keys (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param encodingType Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
         * 
         * @return builder
         * 
         */
        public Builder encodingType(@Nullable Output<String> encodingType) {
            $.encodingType = encodingType;
            return this;
        }

        /**
         * @param encodingType Encodes keys using this method (Default: none; besides none, only &#34;url&#34; can be used)
         * 
         * @return builder
         * 
         */
        public Builder encodingType(String encodingType) {
            return encodingType(Output.of(encodingType));
        }

        /**
         * @param maxKeys Maximum object keys to return (Default: 1000)
         * 
         * @return builder
         * 
         */
        public Builder maxKeys(@Nullable Output<Integer> maxKeys) {
            $.maxKeys = maxKeys;
            return this;
        }

        /**
         * @param maxKeys Maximum object keys to return (Default: 1000)
         * 
         * @return builder
         * 
         */
        public Builder maxKeys(Integer maxKeys) {
            return maxKeys(Output.of(maxKeys));
        }

        /**
         * @param prefix Limits results to object keys with this prefix (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Limits results to object keys with this prefix (Default: none)
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param region The slug of the region where the bucket is stored.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The slug of the region where the bucket is stored.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetSpacesBucketObjectsArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}