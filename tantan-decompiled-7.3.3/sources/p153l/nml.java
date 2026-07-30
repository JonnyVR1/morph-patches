package p153l;

import javax.servlet.annotation.ServletSecurity$EmptyRoleSemantic;
import javax.servlet.annotation.ServletSecurity$TransportGuarantee;

/* JADX INFO: loaded from: classes2.dex */
public class nml {

    /* JADX INFO: renamed from: a */
    public ServletSecurity$EmptyRoleSemantic f142725a;

    /* JADX INFO: renamed from: b */
    public ServletSecurity$TransportGuarantee f142726b;

    /* JADX INFO: renamed from: c */
    public String[] f142727c;

    public nml(ServletSecurity$EmptyRoleSemantic servletSecurity$EmptyRoleSemantic, ServletSecurity$TransportGuarantee servletSecurity$TransportGuarantee, String... strArr) {
        if (servletSecurity$EmptyRoleSemantic == ServletSecurity$EmptyRoleSemantic.DENY && strArr.length > 0) {
            wg3.m206174a("Deny semantic with rolesAllowed");
            throw null;
        }
        this.f142725a = servletSecurity$EmptyRoleSemantic;
        this.f142726b = servletSecurity$TransportGuarantee;
        this.f142727c = strArr;
    }

    /* JADX INFO: renamed from: a */
    public ServletSecurity$EmptyRoleSemantic m163828a() {
        return this.f142725a;
    }

    /* JADX INFO: renamed from: b */
    public String[] m163829b() {
        return this.f142727c;
    }

    /* JADX INFO: renamed from: c */
    public ServletSecurity$TransportGuarantee m163830c() {
        return this.f142726b;
    }

    public nml(ServletSecurity$EmptyRoleSemantic servletSecurity$EmptyRoleSemantic) {
        this(servletSecurity$EmptyRoleSemantic, ServletSecurity$TransportGuarantee.NONE, new String[0]);
    }

    public nml() {
        this(ServletSecurity$EmptyRoleSemantic.PERMIT);
    }
}
