package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4753s;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\tJ'\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m87232d2 = {"Ll/l4y;", "Ll/jq2;", "Ll/z4y;", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "", "L0", "()V", "", "Lcom/p1/mobile/putong/data/User;", "allLikersUser", "P0", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "", "isNewLikers", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "user", "F0", "(ZZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Z", "a0", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "destroy", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "O0", "(IILandroid/content/Intent;)Z", "next", "N0", "(Ljava/lang/String;)V", "a", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "", "b", "J", "seeLastReadTime", "Lcom/p1/mobile/putong/data/DbLinks;", "c", "Lcom/p1/mobile/putong/data/DbLinks;", "E0", "()Lcom/p1/mobile/putong/data/DbLinks;", "setAllLikersLink", "(Lcom/p1/mobile/putong/data/DbLinks;)V", "allLikersLink", "", Constants.INAPP_DATA_TAG, "[Ljava/lang/String;", "customTags", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m148467A0(l4y l4yVar, Bundle bundle) {
        ((z4y) l4yVar.viewModel).m217242p(l4yVar.seeLastReadTime);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m148468C0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public static Boolean m148469D0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Pair m148470G0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Pair m148471H0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: I0 */
    public static final Pair m148472I0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: J0 */
    public static final Pair m148473J0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m148474L0() {
        if (CoreModule.f17554l.m94651a().mo33489e2()) {
            CoreModule.f17545c.f19687u0.m30455l7(this.seeLastReadTime);
            CoreModule.f17545c.f19687u0.m30449j7(this.seeLastReadTime);
        } else {
            CoreModule.f17545c.f19687u0.m30452k7("", this.seeLastReadTime);
            CoreModule.f17545c.f19687u0.m30446i7("", this.seeLastReadTime);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Long m148475e0(User user) {
        return user.profile.receivedLikes;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m148476f0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: g0 */
    public static C22306c m148477g0(Boolean bool) {
        if (bool.booleanValue()) {
            C22306c<Optional<q860<User>>> c22306cM30479t7 = CoreModule.f17545c.f19687u0.m30479t7();
            C22306c<Optional<q860<User>>> c22306cM30473r7 = CoreModule.f17545c.f19687u0.m30473r7();
            final Function2 function2 = new Function2() { // from class: l.w3y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l4y.m148470G0((Optional) obj, (Optional) obj2);
                }
            };
            return mkd0.m154984r(c22306cM30479t7, c22306cM30473r7, new x9j() { // from class: l.x3y
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return l4y.m148471H0(function2, obj, obj2);
                }
            });
        }
        C22306c<Optional<q860<User>>> c22306cM30476s7 = CoreModule.f17545c.f19687u0.m30476s7();
        C22306c<Optional<q860<User>>> c22306cM30470q7 = CoreModule.f17545c.f19687u0.m30470q7();
        final Function2 function3 = new Function2() { // from class: l.y3y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l4y.m148472I0((Optional) obj, (Optional) obj2);
            }
        };
        return mkd0.m154984r(c22306cM30476s7, c22306cM30470q7, new x9j() { // from class: l.a4y
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return l4y.m148473J0(function3, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static C22306c m148478h0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m148481k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m148482l0(l4y l4yVar, Boolean bool) {
        ((z4y) l4yVar.viewModel).m217245u(!bool.booleanValue());
        l4yVar.m148474L0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m148483m0(l4y l4yVar, boolean z, User user) {
        x2y x2yVarM217236i = ((z4y) l4yVar.viewModel).m217236i();
        String str = user.f56011id;
        str.getClass();
        x2yVarM217236i.m206890L(z, str);
        CoreModule.f17545c.f19687u0.m30494y7(z, user.f56011id);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m148484n0(Long l2) {
        if (l2.longValue() > 0) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            pibVar.f149400j3 = Math.max(pibVar.f149400j3, l2.longValue());
            CoreModule.m29935P().m94651a().mo33403Rr(CoreModule.f17545c.f19639e0.f149400j3);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m148485o0(l4y l4yVar, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentMo33551n8 = CoreModule.m29935P().m94651a().mo33551n8(l4yVar.act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList<>(), l4yVar.frag.pageId());
        Act act = l4yVar.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo33551n8, CoreModule.m29935P().m94651a().mo33512hg(l4yVar.act()));
        }
        CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m148486p0() {
        CoreModule.f17545c.f19687u0.m30465p5();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX INFO: renamed from: r0 */
    public static void m148488r0(l4y l4yVar, Pair pair) {
        int i;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        ArrayList arrayList = new ArrayList();
        if (optional.isPresent()) {
            q860 q860Var = (q860) optional.get();
            Collection collection = q860Var.f153135a;
            collection.getClass();
            if (!collection.isEmpty()) {
                int i2 = q860Var.f153136b.total;
                List<T> list = q860Var.f153135a;
                list.getClass();
                arrayList.add(new k3y(i2, list, q860Var.f153136b));
            }
        }
        if (optional2.isPresent()) {
            q860 q860Var2 = (q860) optional2.get();
            List<T> list2 = q860Var2.f153135a;
            list2.getClass();
            if (!list2.isEmpty()) {
                arrayList.add(new m4y("全部喜欢"));
                l4yVar.allLikersLink = q860Var2.f153136b;
                User userM148500P0 = l4yVar.m148500P0(list2);
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    User user = (User) obj;
                    String str = null;
                    if (TextUtils.equals(userM148500P0 != null ? userM148500P0.f56011id : null, user.f56011id)) {
                        String str2 = user.f56011id;
                        str2.getClass();
                        i = Integer.parseInt(str2) % l4yVar.customTags.length;
                    } else {
                        C4753s c4753s = CoreModule.f17545c.f19664m1;
                        String str3 = user.f56011id;
                        str3.getClass();
                        if (c4753s.m34718l4(str3)) {
                            String str4 = user.f56011id;
                            str4.getClass();
                            i = Integer.parseInt(str4) % l4yVar.customTags.length;
                        } else {
                            String str5 = user.f56011id;
                            str5.getClass();
                            i = Integer.parseInt(str5) % 20;
                        }
                    }
                    if (i >= 0 && i < 4) {
                        String str6 = l4yVar.customTags[i];
                        if (StringsKt.m93412P(str6, "%s", false, 2, null)) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str7 = l4yVar.customTags[i];
                            String str8 = user.f56011id;
                            str8.getClass();
                            str = String.format(str7, Arrays.copyOf(new Object[]{Integer.valueOf(((Integer.parseInt(str8) % MMConstants.ERR_VCM_UNKNOWN_ERROR) / 20) + 20)}, 1));
                        } else {
                            str = str6;
                        }
                    }
                    arrayList.add(new p4y(user, str));
                    i3 = i4;
                }
            }
        }
        ((z4y) l4yVar.viewModel).m217244s(arrayList);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m148490t0(User user) {
        String str = user.f56011id;
        str.getClass();
        if (!TextUtils.isDigitsOnly(str)) {
            return Boolean.FALSE;
        }
        String str2 = user.f56011id;
        str2.getClass();
        int i = Integer.parseInt(str2) % 20;
        if (i >= 0 && i < 4) {
            return Boolean.TRUE;
        }
        C4753s c4753s = CoreModule.f17545c.f19664m1;
        String str3 = user.f56011id;
        str3.getClass();
        if (c4753s.m34718l4(str3)) {
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
    public static void m148491u0(Intent intent, int i, l4y l4yVar, int i2, C4319c c4319c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33506gl());
                stringExtra = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33357L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !Intrinsics.m87488d(stringExtra3, stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                zvf0.m220396r("e_iliked_letter", l4yVar.frag.pageId());
            }
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra2);
            if (NullChecker.m81303a(userM169430Pa)) {
                boolean z3 = i2 == 82;
                String str = userM169430Pa.m60124fp().url;
                str.getClass();
                l4yVar.m148497F0(z3, z, z2, false, 0, str, userM169430Pa);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static Long m148492x0(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m148493y0(Counter counter) {
        return Boolean.valueOf(counter == null || counter.likersLimit.remaining <= 0);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m148494z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final void m148495E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        if (!CoreModule.f17554l.m94651a().mo33489e2()) {
            String str = clickedUser.pictures.get(0).url;
            str.getClass();
            if (m148497F0(false, liked, false, fromButton, 0, str, clickedUser)) {
                return;
            }
            ((z4y) this.viewModel).m217236i().notifyDataSetChanged();
            return;
        }
        ((z4y) this.viewModel).m217236i().notifyDataSetChanged();
        if (liked) {
            Intent intentMo33551n8 = CoreModule.m29935P().m94651a().mo33551n8(act(), vwb.m200324f0(clickedUser.f56011id), CoreModule.m29935P().m94651a().mo33508h7(), new ArrayList<>(), "p_meet_see,card_button_pull");
            Act act = act();
            if (act != null) {
                act.startActivityWithCustomTransition(intentMo33551n8, CoreModule.m29935P().m94651a().mo33512hg(act()));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E0, reason: from getter */
    public final DbLinks getAllLikersLink() {
        return this.allLikersLink;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m148497F0(final boolean isNewLikers, boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.m36001F().m132651b().mo35971Ej(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new f30() { // from class: l.b4y
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                l4y.m148485o0(this.f73423a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new d30() { // from class: l.c4y
            @Override // p149l.d30
            public final void call() {
                l4y.m148483m0(this.f79307a, isNewLikers, user);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m148498N0(@Nullable String next) {
        CoreModule.f17545c.f19687u0.m30446i7(next, this.seeLastReadTime);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m148499O0(final int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 81 && requestCode != 82) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.s3y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4y.m148469D0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.t3y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148494z0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.u3y
            @Override // p149l.e30
            public final void call(Object obj) {
                l4y.m148491u0(data, resultCode, this, requestCode, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final User m148500P0(List<? extends User> allLikersUser) {
        User user = (User) vwb.m200350v(allLikersUser, new w9j() { // from class: l.v3y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148490t0((User) obj);
            }
        }, 4);
        if (user != null || allLikersUser == null || !(!allLikersUser.isEmpty())) {
            return user;
        }
        User user2 = allLikersUser.get(Math.min(zbc0.m217835a(0, 4), allLikersUser.size() - 1));
        C4753s c4753s = CoreModule.f17545c.f19664m1;
        String str = user2.f56011id;
        str.getClass();
        c4753s.m34688F5(str);
        return user2;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Long l2 = CoreModule.f17545c.f19687u0.f19254k0.get();
        l2.getClass();
        long jLongValue = l2.longValue();
        this.seeLastReadTime = jLongValue;
        if (jLongValue <= 0) {
            this.seeLastReadTime = mqi0.m155944o();
        }
        m148474L0();
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.o3y
            @Override // p149l.e30
            public final void call(Object obj) {
                l4y.m148467A0(this.f141717a, (Bundle) obj);
            }
        }, new d30() { // from class: l.f4y
            @Override // p149l.d30
            public final void call() {
                l4y.m148486p0();
            }
        });
        C22306c<Counter> c22306cM31483n3 = CoreModule.f17545c.m31483n3();
        final Function1 function1 = new Function1() { // from class: l.g4y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4y.m148476f0((Counter) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM31483n3.map(new w9j() { // from class: l.h4y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148481k0(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: l.i4y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4y.m148477g0((Boolean) obj);
            }
        };
        duringCreated(c22306cDistinctUntilChanged.flatMap(new w9j() { // from class: l.j4y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148478h0(function2, obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.k4y
            @Override // p149l.e30
            public final void call(Object obj) {
                l4y.m148488r0(this.f121132a, (Pair) obj);
            }
        }));
        C22306c<Counter> c22306cM31483n4 = CoreModule.f17545c.m31483n3();
        final Function1 function3 = new Function1() { // from class: l.p3y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4y.m148493y0((Counter) obj);
            }
        };
        duringCreated((C22306c) c22306cM31483n4.map(new w9j() { // from class: l.q3y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148468C0(function3, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.r3y
            @Override // p149l.e30
            public final void call(Object obj) {
                l4y.m148482l0(this.f157618a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19639e0.m169523o9());
        final Function1 function4 = new Function1() { // from class: l.z3y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4y.m148475e0((User) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.d4y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l4y.m148492x0(function4, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.e4y
            @Override // p149l.e30
            public final void call(Object obj) {
                l4y.m148484n0((Long) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
