package com.p000p1.mobile.putong.core.newui.nearby;

import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l.j760;
import l.vwb;
import p009l.q860;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class NearbyPresenter$initSubscription$9 extends FunctionReferenceImpl implements Function2<UserPrivilege, q860<User>, j760<UserPrivilege, q860<User>>> {
    public static final NearbyPresenter$initSubscription$9 INSTANCE = new NearbyPresenter$initSubscription$9();

    public NearbyPresenter$initSubscription$9() {
        super(2, vwb.class, "pair", "pair(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/util/Pair;", 0);
    }

    public final j760<UserPrivilege, q860<User>> invoke(UserPrivilege userPrivilege, q860<User> q860Var) {
        return vwb.Y(userPrivilege, q860Var);
    }
}
