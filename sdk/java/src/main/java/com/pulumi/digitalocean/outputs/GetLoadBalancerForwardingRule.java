// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerForwardingRule {
    private String certificateId;
    private String certificateName;
    private Integer entryPort;
    private String entryProtocol;
    private Integer targetPort;
    private String targetProtocol;
    private Boolean tlsPassthrough;

    private GetLoadBalancerForwardingRule() {}
    public String certificateId() {
        return this.certificateId;
    }
    public String certificateName() {
        return this.certificateName;
    }
    public Integer entryPort() {
        return this.entryPort;
    }
    public String entryProtocol() {
        return this.entryProtocol;
    }
    public Integer targetPort() {
        return this.targetPort;
    }
    public String targetProtocol() {
        return this.targetProtocol;
    }
    public Boolean tlsPassthrough() {
        return this.tlsPassthrough;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerForwardingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateId;
        private String certificateName;
        private Integer entryPort;
        private String entryProtocol;
        private Integer targetPort;
        private String targetProtocol;
        private Boolean tlsPassthrough;
        public Builder() {}
        public Builder(GetLoadBalancerForwardingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.certificateName = defaults.certificateName;
    	      this.entryPort = defaults.entryPort;
    	      this.entryProtocol = defaults.entryProtocol;
    	      this.targetPort = defaults.targetPort;
    	      this.targetProtocol = defaults.targetProtocol;
    	      this.tlsPassthrough = defaults.tlsPassthrough;
        }

        @CustomType.Setter
        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }
        @CustomType.Setter
        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }
        @CustomType.Setter
        public Builder entryPort(Integer entryPort) {
            this.entryPort = Objects.requireNonNull(entryPort);
            return this;
        }
        @CustomType.Setter
        public Builder entryProtocol(String entryProtocol) {
            this.entryProtocol = Objects.requireNonNull(entryProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder targetPort(Integer targetPort) {
            this.targetPort = Objects.requireNonNull(targetPort);
            return this;
        }
        @CustomType.Setter
        public Builder targetProtocol(String targetProtocol) {
            this.targetProtocol = Objects.requireNonNull(targetProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder tlsPassthrough(Boolean tlsPassthrough) {
            this.tlsPassthrough = Objects.requireNonNull(tlsPassthrough);
            return this;
        }
        public GetLoadBalancerForwardingRule build() {
            final var o = new GetLoadBalancerForwardingRule();
            o.certificateId = certificateId;
            o.certificateName = certificateName;
            o.entryPort = entryPort;
            o.entryProtocol = entryProtocol;
            o.targetPort = targetPort;
            o.targetProtocol = targetProtocol;
            o.tlsPassthrough = tlsPassthrough;
            return o;
        }
    }
}
