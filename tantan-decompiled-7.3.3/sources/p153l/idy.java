package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4904s;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\tJ'\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m88121d2 = {"Ll/idy;", "Ll/ar2;", "Ll/wdy;", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "", "L0", "()V", "", "Lcom/p1/mobile/putong/data/User;", "allLikersUser", "P0", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "", "isNewLikers", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "user", "F0", "(ZZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Z", "a0", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "destroy", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "O0", "(IILandroid/content/Intent;)Z", "next", "N0", "(Ljava/lang/String;)V", "a", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "", "b", "J", "seeLastReadTime", "Lcom/p1/mobile/putong/data/DbLinks;", "c", "Lcom/p1/mobile/putong/data/DbLinks;", "E0", "()Lcom/p1/mobile/putong/data/DbLinks;", "setAllLikersLink", "(Lcom/p1/mobile/putong/data/DbLinks;)V", "allLikersLink", "", Constants.INAPP_DATA_TAG, "[Ljava/lang/String;", "customTags", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class idy extends ar2<wdy> {

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
    public idy(@NotNull MeetLikersFrag meetLikersFrag) {
        super(meetLikersFrag);
        meetLikersFrag.getClass();
        this.frag = meetLikersFrag;
        this.customTags = new String[]{"仔细看了你的资料", "好奇你喜欢什么样的人", "%s人中只喜欢了你", "觉得你很特别"};
    }

    /* JADX INFO: renamed from: A0 */
    public static void m139547A0(idy idyVar, Bundle bundle) {
        ((wdy) idyVar.viewModel).m205984p(idyVar.seeLastReadTime);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m139548C0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public static Boolean m139549D0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Pair m139550G0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Pair m139551H0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: I0 */
    public static final Pair m139552I0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: J0 */
    public static final Pair m139553J0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m139554L0() {
        if (CoreModule.f18273l.m143405a().mo34492e2()) {
            CoreModule.f18264c.f20429u0.m31469p7(this.seeLastReadTime);
            CoreModule.f18264c.f20429u0.m31463n7(this.seeLastReadTime);
        } else {
            CoreModule.f18264c.f20429u0.m31466o7("", this.seeLastReadTime);
            CoreModule.f18264c.f20429u0.m31460m7("", this.seeLastReadTime);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Long m139555e0(User user) {
        return user.profile.receivedLikes;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m139556f0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: g0 */
    public static C22421c m139557g0(Boolean bool) {
        if (bool.booleanValue()) {
            C22421c<Optional<vg60<User>>> c22421cM31496y7 = CoreModule.f18264c.f20429u0.m31496y7();
            C22421c<Optional<vg60<User>>> c22421cM31490w7 = CoreModule.f18264c.f20429u0.m31490w7();
            final Function2 function2 = new Function2() { // from class: l.tcy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return idy.m139550G0((Optional) obj, (Optional) obj2);
                }
            };
            return psd0.m173625r(c22421cM31496y7, c22421cM31490w7, new rcj() { // from class: l.ucy
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return idy.m139551H0(function2, obj, obj2);
                }
            });
        }
        C22421c<Optional<vg60<User>>> c22421cM31493x7 = CoreModule.f18264c.f20429u0.m31493x7();
        C22421c<Optional<vg60<User>>> c22421cM31487v7 = CoreModule.f18264c.f20429u0.m31487v7();
        final Function2 function3 = new Function2() { // from class: l.vcy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return idy.m139552I0((Optional) obj, (Optional) obj2);
            }
        };
        return psd0.m173625r(c22421cM31493x7, c22421cM31487v7, new rcj() { // from class: l.xcy
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return idy.m139553J0(function3, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static C22421c m139558h0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m139561k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m139562l0(idy idyVar, Boolean bool) {
        ((wdy) idyVar.viewModel).m205987u(!bool.booleanValue());
        idyVar.m139554L0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m139563m0(idy idyVar, boolean z, User user) {
        uby ubyVarM205978i = ((wdy) idyVar.viewModel).m205978i();
        String str = user.f56859id;
        str.getClass();
        ubyVarM205978i.m195345L(z, str);
        CoreModule.f18264c.f20429u0.m31386D7(z, user.f56859id);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m139564n0(Long l2) {
        if (l2.longValue() > 0) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            dkbVar.f89257j3 = Math.max(dkbVar.f89257j3, l2.longValue());
            CoreModule.m30933P().m143405a().mo34406Rr(CoreModule.f18264c.f20381e0.f89257j3);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m139565o0(idy idyVar, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentMo34554n8 = CoreModule.m30933P().m143405a().mo34554n8(idyVar.act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList<>(), idyVar.frag.pageId());
        Act act = idyVar.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo34554n8, CoreModule.m30933P().m143405a().mo34515hg(idyVar.act()));
        }
        CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m139566p0() {
        CoreModule.f18264c.f20429u0.m31467p5();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX INFO: renamed from: r0 */
    public static void m139568r0(idy idyVar, Pair pair) {
        int i;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        ArrayList arrayList = new ArrayList();
        if (optional.isPresent()) {
            vg60 vg60Var = (vg60) optional.get();
            Collection collection = vg60Var.f184001a;
            collection.getClass();
            if (!collection.isEmpty()) {
                int i2 = vg60Var.f184002b.total;
                List<T> list = vg60Var.f184001a;
                list.getClass();
                arrayList.add(new hcy(i2, list, vg60Var.f184002b));
            }
        }
        if (optional2.isPresent()) {
            vg60 vg60Var2 = (vg60) optional2.get();
            List<T> list2 = vg60Var2.f184001a;
            list2.getClass();
            if (!list2.isEmpty()) {
                arrayList.add(new jdy("全部喜欢"));
                idyVar.allLikersLink = vg60Var2.f184002b;
                User userM139580P0 = idyVar.m139580P0(list2);
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    User user = (User) obj;
                    String str = null;
                    if (TextUtils.equals(userM139580P0 != null ? userM139580P0.f56859id : null, user.f56859id)) {
                        String str2 = user.f56859id;
                        str2.getClass();
                        i = Integer.parseInt(str2) % idyVar.customTags.length;
                    } else {
                        C4904s c4904s = CoreModule.f18264c.f20406m1;
                        String str3 = user.f56859id;
                        str3.getClass();
                        if (c4904s.m35721l4(str3)) {
                            String str4 = user.f56859id;
                            str4.getClass();
                            i = Integer.parseInt(str4) % idyVar.customTags.length;
                        } else {
                            String str5 = user.f56859id;
                            str5.getClass();
                            i = Integer.parseInt(str5) % 20;
                        }
                    }
                    if (i >= 0 && i < 4) {
                        String str6 = idyVar.customTags[i];
                        if (StringsKt.m94303P(str6, "%s", false, 2, null)) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str7 = idyVar.customTags[i];
                            String str8 = user.f56859id;
                            str8.getClass();
                            str = String.format(str7, Arrays.copyOf(new Object[]{Integer.valueOf(((Integer.parseInt(str8) % MMConstants.ERR_VCM_UNKNOWN_ERROR) / 20) + 20)}, 1));
                        } else {
                            str = str6;
                        }
                    }
                    arrayList.add(new mdy(user, str));
                    i3 = i4;
                }
            }
        }
        ((wdy) idyVar.viewModel).m205986s(arrayList);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m139570t0(User user) {
        String str = user.f56859id;
        str.getClass();
        if (!TextUtils.isDigitsOnly(str)) {
            return Boolean.FALSE;
        }
        String str2 = user.f56859id;
        str2.getClass();
        int i = Integer.parseInt(str2) % 20;
        if (i >= 0 && i < 4) {
            return Boolean.TRUE;
        }
        C4904s c4904s = CoreModule.f18264c.f20406m1;
        String str3 = user.f56859id;
        str3.getClass();
        if (c4904s.m35721l4(str3)) {
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
    public static void m139571u0(Intent intent, int i, idy idyVar, int i2, C4470c c4470c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34509gl());
                stringExtra = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34360L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !Intrinsics.m88377d(stringExtra3, stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                i4g0.m138520r("e_iliked_letter", idyVar.frag.pageId());
            }
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra2);
            if (NullChecker.m82486a(userM116503Pa)) {
                boolean z3 = i2 == 82;
                String str = userM116503Pa.m61308fp().url;
                str.getClass();
                idyVar.m139577F0(z3, z, z2, false, 0, str, userM116503Pa);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static Long m139572x0(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m139573y0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m139574z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final void m139575E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        if (!CoreModule.f18273l.m143405a().mo34492e2()) {
            String str = clickedUser.pictures.get(0).url;
            str.getClass();
            if (m139577F0(false, liked, false, fromButton, 0, str, clickedUser)) {
                return;
            }
            ((wdy) this.viewModel).m205978i().notifyDataSetChanged();
            return;
        }
        ((wdy) this.viewModel).m205978i().notifyDataSetChanged();
        if (liked) {
            Intent intentMo34554n8 = CoreModule.m30933P().m143405a().mo34554n8(act(), jyb.m147507f0(clickedUser.f56859id), CoreModule.m30933P().m143405a().mo34511h7(), new ArrayList<>(), "p_meet_see,card_button_pull");
            Act act = act();
            if (act != null) {
                act.startActivityWithCustomTransition(intentMo34554n8, CoreModule.m30933P().m143405a().mo34515hg(act()));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E0, reason: from getter */
    public final DbLinks getAllLikersLink() {
        return this.allLikersLink;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m139577F0(final boolean isNewLikers, boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.m37004F().m187693b().mo36974Ej(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new z20() { // from class: l.ycy
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                idy.m139565o0(this.f198556a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new x20() { // from class: l.zcy
            @Override // p153l.x20
            public final void call() {
                idy.m139563m0(this.f203840a, isNewLikers, user);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m139578N0(@Nullable String next) {
        CoreModule.f18264c.f20429u0.m31460m7(next, this.seeLastReadTime);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m139579O0(final int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 81 && requestCode != 82) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.pcy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return idy.m139549D0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.qcy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139574z0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.rcy
            @Override // p153l.y20
            public final void call(Object obj) {
                idy.m139571u0(data, resultCode, this, requestCode, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final User m139580P0(List<? extends User> allLikersUser) {
        User user = (User) jyb.m147533v(allLikersUser, new qcj() { // from class: l.scy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139570t0((User) obj);
            }
        }, 4);
        if (user != null || allLikersUser == null || !(!allLikersUser.isEmpty())) {
            return user;
        }
        User user2 = allLikersUser.get(Math.min(gkc0.m130573a(0, 4), allLikersUser.size() - 1));
        C4904s c4904s = CoreModule.f18264c.f20406m1;
        String str = user2.f56859id;
        str.getClass();
        c4904s.m35691F5(str);
        return user2;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Long l2 = CoreModule.f18264c.f20429u0.f19996l0.get();
        l2.getClass();
        long jLongValue = l2.longValue();
        this.seeLastReadTime = jLongValue;
        if (jLongValue <= 0) {
            this.seeLastReadTime = pzi0.m174454o();
        }
        m139554L0();
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lcy
            @Override // p153l.y20
            public final void call(Object obj) {
                idy.m139547A0(this.f131388a, (Bundle) obj);
            }
        }, new x20() { // from class: l.cdy
            @Override // p153l.x20
            public final void call() {
                idy.m139566p0();
            }
        });
        C22421c<Counter> c22421cM32486n3 = CoreModule.f18264c.m32486n3();
        final Function1 function1 = new Function1() { // from class: l.ddy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return idy.m139556f0((Counter) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM32486n3.map(new qcj() { // from class: l.edy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139561k0(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: l.fdy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return idy.m139557g0((Boolean) obj);
            }
        };
        duringCreated(c22421cDistinctUntilChanged.flatMap(new qcj() { // from class: l.gdy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139558h0(function2, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.hdy
            @Override // p153l.y20
            public final void call(Object obj) {
                idy.m139568r0(this.f109053a, (Pair) obj);
            }
        }));
        C22421c<Counter> c22421cM32486n4 = CoreModule.f18264c.m32486n3();
        final Function1 function3 = new Function1() { // from class: l.mcy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return idy.m139573y0((Counter) obj);
            }
        };
        duringCreated((C22421c) c22421cM32486n4.map(new qcj() { // from class: l.ncy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139548C0(function3, obj);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ocy
            @Override // p153l.y20
            public final void call(Object obj) {
                idy.m139562l0(this.f146751a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20381e0.m116596o9());
        final Function1 function4 = new Function1() { // from class: l.wcy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return idy.m139555e0((User) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.ady
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return idy.m139572x0(function4, obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bdy
            @Override // p153l.y20
            public final void call(Object obj) {
                idy.m139564n0((Long) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
