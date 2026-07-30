package com.p051p1.mobile.putong.core.newui.nearby;

import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p153l.jyb;
import p153l.pf60;
import p153l.vg60;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* synthetic */ class NearbyPresenter$initSubscription$9 extends FunctionReferenceImpl implements Function2<UserPrivilege, vg60<User>, pf60<UserPrivilege, vg60<User>>> {
    public static final NearbyPresenter$initSubscription$9 INSTANCE = new NearbyPresenter$initSubscription$9();

    public NearbyPresenter$initSubscription$9() {
        super(2, jyb.class, "pair", "pair(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/util/Pair;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final pf60<UserPrivilege, vg60<User>> invoke(UserPrivilege userPrivilege, vg60<User> vg60Var) {
        return jyb.m147494Y(userPrivilege, vg60Var);
    }
}
