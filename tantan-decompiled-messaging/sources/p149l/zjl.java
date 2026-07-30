package p149l;

import javax.servlet.annotation.ServletSecurity$EmptyRoleSemantic;
import javax.servlet.annotation.ServletSecurity$TransportGuarantee;

/* JADX INFO: loaded from: classes2.dex */
public class zjl {

    /* JADX INFO: renamed from: a */
    public ServletSecurity$EmptyRoleSemantic f203425a;

    /* JADX INFO: renamed from: b */
    public ServletSecurity$TransportGuarantee f203426b;

    /* JADX INFO: renamed from: c */
    public String[] f203427c;

    public zjl(ServletSecurity$EmptyRoleSemantic servletSecurity$EmptyRoleSemantic, ServletSecurity$TransportGuarantee servletSecurity$TransportGuarantee, String... strArr) {
        if (servletSecurity$EmptyRoleSemantic == ServletSecurity$EmptyRoleSemantic.DENY && strArr.length > 0) {
            ig3.m135964a("Deny semantic with rolesAllowed");
            throw null;
        }
        this.f203425a = servletSecurity$EmptyRoleSemantic;
        this.f203426b = servletSecurity$TransportGuarantee;
        this.f203427c = strArr;
    }

    /* JADX INFO: renamed from: a */
    public ServletSecurity$EmptyRoleSemantic m219122a() {
        return this.f203425a;
    }

    /* JADX INFO: renamed from: b */
    public String[] m219123b() {
        return this.f203427c;
    }

    /* JADX INFO: renamed from: c */
    public ServletSecurity$TransportGuarantee m219124c() {
        return this.f203426b;
    }

    public zjl(ServletSecurity$EmptyRoleSemantic servletSecurity$EmptyRoleSemantic) {
        this(servletSecurity$EmptyRoleSemantic, ServletSecurity$TransportGuarantee.NONE, new String[0]);
    }

    public zjl() {
        this(ServletSecurity$EmptyRoleSemantic.PERMIT);
    }
}
