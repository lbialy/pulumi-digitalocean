// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsSortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRegionsSortArgs Empty = new GetRegionsSortArgs();

    /**
     * The sort direction. This may be either `asc` or `desc`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Sort the regions by this key. This may be one of `slug`,
     * `name`, or `available`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Sort the regions by this key. This may be one of `slug`,
     * `name`, or `available`.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private GetRegionsSortArgs() {}

    private GetRegionsSortArgs(GetRegionsSortArgs $) {
        this.direction = $.direction;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsSortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsSortArgs $;

        public Builder() {
            $ = new GetRegionsSortArgs();
        }

        public Builder(GetRegionsSortArgs defaults) {
            $ = new GetRegionsSortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param key Sort the regions by this key. This may be one of `slug`,
         * `name`, or `available`.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Sort the regions by this key. This may be one of `slug`,
         * `name`, or `available`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public GetRegionsSortArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}