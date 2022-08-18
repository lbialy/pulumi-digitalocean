// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecJobImage {
    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    private final @Nullable String registry;
    /**
     * @return The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    private final String registryType;
    /**
     * @return The repository name.
     * 
     */
    private final String repository;
    /**
     * @return The repository tag. Defaults to `latest` if not provided.
     * 
     */
    private final @Nullable String tag;

    @CustomType.Constructor
    private AppSpecJobImage(
        @CustomType.Parameter("registry") @Nullable String registry,
        @CustomType.Parameter("registryType") String registryType,
        @CustomType.Parameter("repository") String repository,
        @CustomType.Parameter("tag") @Nullable String tag) {
        this.registry = registry;
        this.registryType = registryType;
        this.repository = repository;
        this.tag = tag;
    }

    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    public Optional<String> registry() {
        return Optional.ofNullable(this.registry);
    }
    /**
     * @return The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    public String registryType() {
        return this.registryType;
    }
    /**
     * @return The repository name.
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return The repository tag. Defaults to `latest` if not provided.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecJobImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String registry;
        private String registryType;
        private String repository;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSpecJobImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registry = defaults.registry;
    	      this.registryType = defaults.registryType;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder registry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }
        public Builder registryType(String registryType) {
            this.registryType = Objects.requireNonNull(registryType);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }        public AppSpecJobImage build() {
            return new AppSpecJobImage(registry, registryType, repository, tag);
        }
    }
}