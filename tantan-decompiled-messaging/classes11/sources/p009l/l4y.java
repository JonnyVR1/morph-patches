package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.s;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import l.d30;
import l.e30;
import l.f30;
import l.jq2;
import l.mkd0;
import l.pib;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zbc0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\tJ'\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ll/l4y;", "Ll/jq2;", "Ll/z4y;", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "", "L0", "()V", "", "Lcom/p1/mobile/putong/data/User;", "allLikersUser", "P0", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "", "isNewLikers", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "user", "F0", "(ZZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Z", "a0", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "destroy", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "O0", "(IILandroid/content/Intent;)Z", "next", "N0", "(Ljava/lang/String;)V", "a", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "", "b", "J", "seeLastReadTime", "Lcom/p1/mobile/putong/data/DbLinks;", "c", "Lcom/p1/mobile/putong/data/DbLinks;", "E0", "()Lcom/p1/mobile/putong/data/DbLinks;", "setAllLikersLink", "(Lcom/p1/mobile/putong/data/DbLinks;)V", "allLikersLink", "", "d", "[Ljava/lang/String;", "customTags", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class l4y extends jq2<z4y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MeetLikersFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long seeLastReadTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public DbLinks allLikersLink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String[] customTags;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4y(@NotNull MeetLikersFrag meetLikersFrag) {
        super(meetLikersFrag);
        meetLikersFrag.getClass();
        this.frag = meetLikersFrag;
        this.customTags = new String[]{"仔细看了你的资料", "好奇你喜欢什么样的人", "%s人中只喜欢了你", "觉得你很特别"};
    }

    /* JADX INFO: renamed from: A0 */
    public static void m17656A0(l4y l4yVar, Bundle bundle) {
        ((z4y) ((jq2) l4yVar).viewModel).m25603p(l4yVar.seeLastReadTime);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m17657C0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public static Boolean m17658D0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Pair m17659G0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Pair m17660H0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: I0 */
    public static final Pair m17661I0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: J0 */
    public static final Pair m17662J0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m17663L0() {
        if (CoreModule.l.a().e2()) {
            CoreModule.c.u0.l7(this.seeLastReadTime);
            CoreModule.c.u0.j7(this.seeLastReadTime);
        } else {
            CoreModule.c.u0.k7("", this.seeLastReadTime);
            CoreModule.c.u0.i7("", this.seeLastReadTime);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Long m17664e0(User user) {
        return user.profile.receivedLikes;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m17665f0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: g0 */
    public static rx.c m17666g0(Boolean bool) {
        if (bool.booleanValue()) {
            rx.c cVarT7 = CoreModule.c.u0.t7();
            rx.c cVarR7 = CoreModule.c.u0.r7();
            final Function2 function2 = new Function2() { // from class: l.w3y
                public final Object invoke(Object obj, Object obj2) {
                    return l4y.m17659G0((Optional) obj, (Optional) obj2);
                }
            };
            return mkd0.r(cVarT7, cVarR7, new x9j() { // from class: l.x3y
                public final Object call(Object obj, Object obj2) {
                    return l4y.m17660H0(function2, obj, obj2);
                }
            });
        }
        rx.c cVarS7 = CoreModule.c.u0.s7();
        rx.c cVarQ7 = CoreModule.c.u0.q7();
        final Function2 function3 = new Function2() { // from class: l.y3y
            public final Object invoke(Object obj, Object obj2) {
                return l4y.m17661I0((Optional) obj, (Optional) obj2);
            }
        };
        return mkd0.r(cVarS7, cVarQ7, new x9j() { // from class: l.a4y
            public final Object call(Object obj, Object obj2) {
                return l4y.m17662J0(function3, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static rx.c m17667h0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m17670k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m17671l0(l4y l4yVar, Boolean bool) {
        ((z4y) ((jq2) l4yVar).viewModel).m25606u(!bool.booleanValue());
        l4yVar.m17663L0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m17672m0(l4y l4yVar, boolean z, User user) {
        x2y x2yVarM25596i = ((z4y) ((jq2) l4yVar).viewModel).m25596i();
        String str = ((DbObject) user).id;
        str.getClass();
        x2yVarM25596i.m24691L(z, str);
        CoreModule.c.u0.y7(z, ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m17673n0(Long l2) {
        if (l2.longValue() > 0) {
            pib pibVar = CoreModule.c.e0;
            pibVar.j3 = Math.max(pibVar.j3, l2.longValue());
            CoreModule.P().a().Rr(CoreModule.c.e0.j3);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m17674o0(l4y l4yVar, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentN8 = CoreModule.P().a().n8(l4yVar.act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList(), l4yVar.frag.pageId());
        Act act = l4yVar.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentN8, CoreModule.P().a().hg(l4yVar.act()));
        }
        CoreModule.c.m0.E8(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m17675p0() {
        CoreModule.c.u0.p5();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX INFO: renamed from: r0 */
    public static void m17677r0(l4y l4yVar, Pair pair) {
        int i;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        ArrayList arrayList = new ArrayList();
        if (optional.isPresent()) {
            q860 q860Var = (q860) optional.get();
            Collection collection = q860Var.f19068a;
            collection.getClass();
            if (!collection.isEmpty()) {
                int i2 = q860Var.f19069b.total;
                List<T> list = q860Var.f19068a;
                list.getClass();
                arrayList.add(new k3y(i2, list, q860Var.f19069b));
            }
        }
        if (optional2.isPresent()) {
            q860 q860Var2 = (q860) optional2.get();
            List<T> list2 = q860Var2.f19068a;
            list2.getClass();
            if (!list2.isEmpty()) {
                arrayList.add(new m4y("全部喜欢"));
                l4yVar.allLikersLink = q860Var2.f19069b;
                User userM17689P0 = l4yVar.m17689P0(list2);
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    User user = (User) obj;
                    String str = null;
                    if (TextUtils.equals(userM17689P0 != null ? ((DbObject) userM17689P0).id : null, ((DbObject) user).id)) {
                        String str2 = ((DbObject) user).id;
                        str2.getClass();
                        i = Integer.parseInt(str2) % l4yVar.customTags.length;
                    } else {
                        s sVar = CoreModule.c.m1;
                        String str3 = ((DbObject) user).id;
                        str3.getClass();
                        if (sVar.l4(str3)) {
                            String str4 = ((DbObject) user).id;
                            str4.getClass();
                            i = Integer.parseInt(str4) % l4yVar.customTags.length;
                        } else {
                            String str5 = ((DbObject) user).id;
                            str5.getClass();
                            i = Integer.parseInt(str5) % 20;
                        }
                    }
                    if (i >= 0 && i < 4) {
                        String str6 = l4yVar.customTags[i];
                        if (StringsKt.P(str6, "%s", false, 2, (Object) null)) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str7 = l4yVar.customTags[i];
                            String str8 = ((DbObject) user).id;
                            str8.getClass();
                            str = String.format(str7, Arrays.copyOf(new Object[]{Integer.valueOf(((Integer.parseInt(str8) % 1600) / 20) + 20)}, 1));
                        } else {
                            str = str6;
                        }
                    }
                    arrayList.add(new p4y(user, str));
                    i3 = i4;
                }
            }
        }
        ((z4y) ((jq2) l4yVar).viewModel).m25605s(arrayList);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m17679t0(User user) {
        String str = ((DbObject) user).id;
        str.getClass();
        if (!TextUtils.isDigitsOnly(str)) {
            return Boolean.FALSE;
        }
        String str2 = ((DbObject) user).id;
        str2.getClass();
        int i = Integer.parseInt(str2) % 20;
        if (i >= 0 && i < 4) {
            return Boolean.TRUE;
        }
        s sVar = CoreModule.c.m1;
        String str3 = ((DbObject) user).id;
        str3.getClass();
        if (sVar.l4(str3)) {
            return Boolean.TRUE;
        }
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: u0 */
    public static void m17680u0(Intent intent, int i, l4y l4yVar, int i2, c cVar) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.l.a().Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.l.a().gl());
                stringExtra = intent.getStringExtra(CoreModule.l.a().L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.l.a().Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !Intrinsics.d(stringExtra3, stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                zvf0.r("e_iliked_letter", l4yVar.frag.pageId());
            }
            User userPa = CoreModule.c.e0.Pa(stringExtra2);
            if (NullChecker.a(userPa)) {
                boolean z3 = i2 == 82;
                String str = ((Media) userPa.fp()).url;
                str.getClass();
                l4yVar.m17686F0(z3, z, z2, false, 0, str, userPa);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static Long m17681x0(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m17682y0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m17683z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final void m17684E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        if (!CoreModule.l.a().e2()) {
            String str = ((Media) clickedUser.pictures.get(0)).url;
            str.getClass();
            if (m17686F0(false, liked, false, fromButton, 0, str, clickedUser)) {
                return;
            }
            ((z4y) ((jq2) this).viewModel).m25596i().notifyDataSetChanged();
            return;
        }
        ((z4y) ((jq2) this).viewModel).m25596i().notifyDataSetChanged();
        if (liked) {
            Intent intentN8 = CoreModule.P().a().n8(act(), vwb.f0(new String[]{((DbObject) clickedUser).id}), CoreModule.P().a().h7(), new ArrayList(), "p_meet_see,card_button_pull");
            Act act = act();
            if (act != null) {
                act.startActivityWithCustomTransition(intentN8, CoreModule.P().a().hg(act()));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E0, reason: from getter */
    public final DbLinks getAllLikersLink() {
        return this.allLikersLink;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m17686F0(final boolean isNewLikers, boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.F().b().Ej(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new f30() { // from class: l.b4y
            public final void call(Object obj, Object obj2) {
                l4y.m17674o0(this.f9904a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new d30() { // from class: l.c4y
            public final void call() {
                l4y.m17672m0(this.f10437a, isNewLikers, user);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m17687N0(@Nullable String next) {
        CoreModule.c.u0.i7(next, this.seeLastReadTime);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m17688O0(final int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 81 && requestCode != 82) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.s3y
            public final Object invoke(Object obj) {
                return l4y.m17658D0((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.t3y
            public final Object call(Object obj) {
                return l4y.m17683z0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.u3y
            public final void call(Object obj) {
                l4y.m17680u0(data, resultCode, this, requestCode, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final User m17689P0(List<? extends User> allLikersUser) {
        User user = (User) vwb.v(allLikersUser, new w9j() { // from class: l.v3y
            public final Object call(Object obj) {
                return l4y.m17679t0((User) obj);
            }
        }, 4);
        if (user != null || allLikersUser == null || !(!allLikersUser.isEmpty())) {
            return user;
        }
        User user2 = allLikersUser.get(Math.min(zbc0.a(0, 4), allLikersUser.size() - 1));
        s sVar = CoreModule.c.m1;
        String str = ((DbObject) user2).id;
        str.getClass();
        sVar.F5(str);
        return user2;
    }

    /* JADX INFO: renamed from: Z */
    public void m17690Z() {
        super.Z();
        Object obj = CoreModule.c.u0.k0.get();
        obj.getClass();
        long jLongValue = ((Number) obj).longValue();
        this.seeLastReadTime = jLongValue;
        if (jLongValue <= 0) {
            this.seeLastReadTime = mqi0.m18550o();
        }
        m17663L0();
        CoreModule.c.u0.k0.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.e0.W9(CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: a0 */
    public void m17691a0() {
        super.a0();
        creates(new e30() { // from class: l.o3y
            public final void call(Object obj) {
                l4y.m17656A0(this.f17825a, (Bundle) obj);
            }
        }, new d30() { // from class: l.f4y
            public final void call() {
                l4y.m17675p0();
            }
        });
        rx.c cVarN3 = CoreModule.c.n3();
        final Function1 function1 = new Function1() { // from class: l.g4y
            public final Object invoke(Object obj) {
                return l4y.m17665f0((Counter) obj);
            }
        };
        rx.c cVarDistinctUntilChanged = cVarN3.map(new w9j() { // from class: l.h4y
            public final Object call(Object obj) {
                return l4y.m17670k0(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: l.i4y
            public final Object invoke(Object obj) {
                return l4y.m17666g0((Boolean) obj);
            }
        };
        duringCreated(cVarDistinctUntilChanged.flatMap(new w9j() { // from class: l.j4y
            public final Object call(Object obj) {
                return l4y.m17667h0(function2, obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.k4y
            public final void call(Object obj) {
                l4y.m17677r0(this.f15414a, (Pair) obj);
            }
        }));
        rx.c cVarN4 = CoreModule.c.n3();
        final Function1 function3 = new Function1() { // from class: l.p3y
            public final Object invoke(Object obj) {
                return l4y.m17682y0((Counter) obj);
            }
        };
        duringCreated(cVarN4.map(new w9j() { // from class: l.q3y
            public final Object call(Object obj) {
                return l4y.m17657C0(function3, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.r3y
            public final void call(Object obj) {
                l4y.m17671l0(this.f19631a, (Boolean) obj);
            }
        }));
        rx.c cVarDuringCreated = duringCreated(CoreModule.c.e0.o9());
        final Function1 function4 = new Function1() { // from class: l.z3y
            public final Object invoke(Object obj) {
                return l4y.m17664e0((User) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.d4y
            public final Object call(Object obj) {
                return l4y.m17681x0(function4, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.e4y
            public final void call(Object obj) {
                l4y.m17673n0((Long) obj);
            }
        }));
    }

    public void destroy() {
    }
}
