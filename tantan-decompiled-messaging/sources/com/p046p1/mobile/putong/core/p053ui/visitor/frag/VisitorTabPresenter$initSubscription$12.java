package com.p046p1.mobile.putong.core.p053ui.visitor.frag;

import com.p046p1.mobile.putong.core.data.UserPrivilege;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* synthetic */ class VisitorTabPresenter$initSubscription$12 extends FunctionReferenceImpl implements Function1<UserPrivilege, Boolean> {
    public static final VisitorTabPresenter$initSubscription$12 INSTANCE = new VisitorTabPresenter$initSubscription$12();

    public VisitorTabPresenter$initSubscription$12() {
        super(1, xma.class, "isExpired", "isExpired(Lcom/p1/mobile/putong/core/data/UserPrivilege;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210055T3(userPrivilege));
    }
}
