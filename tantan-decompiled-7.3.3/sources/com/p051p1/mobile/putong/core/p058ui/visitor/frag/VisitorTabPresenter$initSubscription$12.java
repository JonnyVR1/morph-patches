package com.p051p1.mobile.putong.core.p058ui.visitor.frag;

import com.p051p1.mobile.putong.core.data.UserPrivilege;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p153l.joa;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* synthetic */ class VisitorTabPresenter$initSubscription$12 extends FunctionReferenceImpl implements Function1<UserPrivilege, Boolean> {
    public static final VisitorTabPresenter$initSubscription$12 INSTANCE = new VisitorTabPresenter$initSubscription$12();

    public VisitorTabPresenter$initSubscription$12() {
        super(1, joa.class, "isExpired", "isExpired(Lcom/p1/mobile/putong/core/data/UserPrivilege;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146369U3(userPrivilege));
    }
}
