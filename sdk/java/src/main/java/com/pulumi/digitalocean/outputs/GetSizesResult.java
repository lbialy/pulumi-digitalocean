// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetSizesFilter;
import com.pulumi.digitalocean.outputs.GetSizesSize;
import com.pulumi.digitalocean.outputs.GetSizesSort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSizesResult {
    private @Nullable List<GetSizesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetSizesSize> sizes;
    private @Nullable List<GetSizesSort> sorts;

    private GetSizesResult() {}
    public List<GetSizesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetSizesSize> sizes() {
        return this.sizes;
    }
    public List<GetSizesSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSizesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetSizesFilter> filters;
        private String id;
        private List<GetSizesSize> sizes;
        private @Nullable List<GetSizesSort> sorts;
        public Builder() {}
        public Builder(GetSizesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.sizes = defaults.sizes;
    	      this.sorts = defaults.sorts;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetSizesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSizesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder sizes(List<GetSizesSize> sizes) {
            this.sizes = Objects.requireNonNull(sizes);
            return this;
        }
        public Builder sizes(GetSizesSize... sizes) {
            return sizes(List.of(sizes));
        }
        @CustomType.Setter
        public Builder sorts(@Nullable List<GetSizesSort> sorts) {
            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetSizesSort... sorts) {
            return sorts(List.of(sorts));
        }
        public GetSizesResult build() {
            final var o = new GetSizesResult();
            o.filters = filters;
            o.id = id;
            o.sizes = sizes;
            o.sorts = sorts;
            return o;
        }
    }
}
