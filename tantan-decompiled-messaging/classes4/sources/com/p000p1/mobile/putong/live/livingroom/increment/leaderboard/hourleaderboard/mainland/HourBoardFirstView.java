package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardFirstView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.LivingNewTagView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.ap0;
import l.e30;
import l.hce;
import l.hxs;
import l.mqv;
import l.t100;
import l.uvr;
import l.w8u;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.bgl;
import p002l.dfl;
import p002l.gar;
import p002l.i3c0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u0010J\u001d\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J1\u0010(\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180%2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110'2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0010J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0010J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\"\u00106\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010<\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u000eR\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u00108\u001a\u0004\bV\u0010:\"\u0004\bW\u0010\u000eR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u0010p\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010c\u001a\u0004\bn\u0010e\"\u0004\bo\u0010gR\"\u0010t\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010O\u001a\u0004\br\u0010Q\"\u0004\bs\u0010SR\u0018\u0010w\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "k0", "(Landroid/view/View;)V", "r", "()V", "", "userImage", "userName", "", "amount", "n0", "(Ljava/lang/String;Ljava/lang/String;J)V", "Lcom/p1/mobile/putong/live/base/data/BLiveLeaderBoards;", "boards", "week", "o0", "(Lcom/p1/mobile/putong/live/base/data/BLiveLeaderBoards;Ljava/lang/String;)V", "m0", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "hourLeaderBoardItem", "Ll/dfl;", "listener", "p0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Ll/dfl;)V", "Ll/mqv;", "leaderBoards", "Ll/e30;", "q0", "(Ll/mqv;Ll/e30;Ljava/lang/String;)V", "r0", "l0", "", "isCur", "setHeartColorAndText", "(Z)V", "d", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_rank_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_rank_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_rank_svga", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VImage;", "h", "Lv/VImage;", "get_crown", "()Lv/VImage;", "set_crown", "(Lv/VImage;)V", "_crown", "i", "get_avatar_bottom", "set_avatar_bottom", "_avatar_bottom", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "j", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_living", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_living", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_living", "Lv/VText;", "k", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "l", "get_heart", "set_heart", "_heart", "m", "get_rank", "set_rank", "_rank", "n", "get_rank_icon", "set_rank_icon", "_rank_icon", "o", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "mHourLeaderBoardItem", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HourBoardFirstView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public HourBoardFirstView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayer _rank_svga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _crown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _avatar_bottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LivingNewTagView _living;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _heart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _rank;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _rank_icon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BLiveHourLeaderBoardItem mHourLeaderBoardItem;

    public /* synthetic */ HourBoardFirstView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m8422h0(e30 e30Var, User user, View view) {
        e30Var.call(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m8423i0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m8424j0(dfl dflVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        dflVar.mo8526F(bLiveHourLeaderBoardItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final void m8425r() {
        float fY0 = xdl0.y0() * 0.35466668f;
        int i = (int) fY0;
        xdl0.D0(i, new View[]{this});
        int i2 = (int) (fY0 / 0.66169155f);
        xdl0.C0(this, i2);
        xdl0.D0(i, new View[]{get_rank_svga()});
        xdl0.C0(get_rank_svga(), i2);
        xdl0.D0(i, new View[]{get_bg()});
        xdl0.C0(get_bg(), i2);
        int i3 = (int) (0.556391f * fY0);
        xdl0.D0(i3, new View[]{get_avatar()});
        xdl0.C0(get_avatar(), i3);
        int i4 = (int) (0.7819549f * fY0);
        xdl0.D0(i4, new View[]{get_crown()});
        xdl0.C0(get_crown(), i4);
        xdl0.X(get_avatar(), (int) (0.24812031f * fY0));
        xdl0.X(get_name(), (int) (fY0 * 0.120300755f));
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_avatar");
        return null;
    }

    @NotNull
    public final View get_avatar_bottom() {
        View view = this._avatar_bottom;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_avatar_bottom");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    public final VImage get_crown() {
        VImage vImage = this._crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_crown");
        return null;
    }

    @NotNull
    public final VText get_heart() {
        VText vText = this._heart;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_heart");
        return null;
    }

    @NotNull
    public final LivingNewTagView get_living() {
        LivingNewTagView livingNewTagView = this._living;
        if (livingNewTagView != null) {
            return livingNewTagView;
        }
        Intrinsics.r("_living");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final VText get_rank() {
        VText vText = this._rank;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rank");
        return null;
    }

    @NotNull
    public final VImage get_rank_icon() {
        VImage vImage = this._rank_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_rank_icon");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_rank_svga() {
        AnimEffectPlayer animEffectPlayer = this._rank_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_rank_svga");
        return null;
    }

    @NotNull
    public final HourBoardFirstView get_root() {
        HourBoardFirstView hourBoardFirstView = this._root;
        if (hourBoardFirstView != null) {
            return hourBoardFirstView;
        }
        Intrinsics.r("_root");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8426k0(View view) {
        bgl.m10322a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8427l0() {
        this.mHourLeaderBoardItem = null;
        get_avatar().setController((hce) null);
        get_name().setText(ypv.e.getString(R$string.f3403l6));
        get_heart().setText("");
        xdl0.M(get_heart(), false);
        get_rank().setText("");
        xdl0.M(get_rank(), false);
        xdl0.M(get_rank_icon(), false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8428m0() {
        get_rank_svga().l("https://auto.tancdn.com/v1/raw/5aa8daac-87da-4bca-9ea9-61a6985b620413.pdf", -1, (ap0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m8429n0(String userImage, String userName, long amount) {
        xdl0.M0(get_avatar(), true);
        if (userImage.length() > 0) {
            hxs.s("context_single_room", get_avatar(), userImage);
        }
        get_name().setText(userName);
        xdl0.M(get_heart(), uvr.d().u0());
        if (w8u.B()) {
            get_heart().setText(gar.m13675c(uvr.d().s0(), amount));
        } else {
            get_heart().setText(String.valueOf(amount));
            xdl0.k(get_heart(), getResources().getDrawable(uvr.d().s0() ? i3c0.f12570M3 : i3c0.f12878n));
            get_heart().setCompoundDrawablePadding(t100.c);
        }
        m8428m0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8430o0(BLiveLeaderBoards boards, String week) {
        if (!TextUtils.equals(week, "currentWeek")) {
            xdl0.M(get_rank(), false);
            xdl0.M(get_rank_icon(), false);
            return;
        }
        xdl0.M(get_rank(), true);
        if (boards.isNewUser) {
            xdl0.M(get_rank_icon(), false);
            xdl0.H0(get_rank(), "NEW");
            get_rank().setTextColor(Color.parseColor("#FF603D"));
            return;
        }
        get_rank().setTextColor(Color.parseColor("#66FFFFFF"));
        xdl0.M(get_rank_icon(), true);
        VText vText = get_rank();
        int i = boards.rankDiff;
        xdl0.H0(vText, "本周排名" + (i == 0 ? "" : Integer.valueOf(i)));
        int i2 = boards.rankDiff;
        if (i2 > 0) {
            xdl0.N(get_rank_icon(), i3c0.f12717Z5);
        } else if (i2 < 0) {
            xdl0.N(get_rank_icon(), i3c0.f12695X5);
        } else {
            xdl0.N(get_rank_icon(), i3c0.f12706Y5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8426k0(this);
        m8425r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m8431p0(@NotNull final BLiveHourLeaderBoardItem hourLeaderBoardItem, @NotNull final dfl listener) {
        hourLeaderBoardItem.getClass();
        listener.getClass();
        String str = hourLeaderBoardItem.userImage;
        str.getClass();
        String str2 = hourLeaderBoardItem.userName;
        str2.getClass();
        m8429n0(str, str2, hourLeaderBoardItem.amount);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.agl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardFirstView.m8424j0(listener, hourLeaderBoardItem, view);
            }
        });
        LivingNewTagView livingNewTagView = get_living();
        BLiveState bLiveState = hourLeaderBoardItem.liveState;
        bLiveState.getClass();
        livingNewTagView.s(bLiveState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m8432q0(@NotNull mqv<BLiveLeaderBoards> leaderBoards, @NotNull final e30<String> listener, @NotNull String week) {
        leaderBoards.getClass();
        listener.getClass();
        week.getClass();
        final User user = ((BLiveLeaderBoards) leaderBoards.a).user;
        if (NullChecker.a(user)) {
            get_heart().setTextColor(Color.parseColor("#FE7E1D"));
            Object obj = leaderBoards.a;
            obj.getClass();
            m8430o0((BLiveLeaderBoards) obj, week);
            String str = ((Media) user.pictures.get(0)).url;
            str.getClass();
            String str2 = user.name;
            str2.getClass();
            m8429n0(str, str2, (long) ((BLiveLeaderBoards) leaderBoards.a).amount);
            setOnClickListener(new View.OnClickListener() { // from class: l.zfl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HourBoardFirstView.m8422h0(listener, user, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final void m8433r0() {
        m8428m0();
        get_name().setText(ypv.e.getString(R$string.f3403l6));
        xdl0.M(get_living(), false);
        setOnClickListener(new View.OnClickListener() { // from class: l.yfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardFirstView.m8423i0(view);
            }
        });
    }

    public final void setHeartColorAndText(boolean isCur) {
        VText vText;
        String str;
        get_heart().setTextColor(Color.parseColor("#FE7E1D"));
        if (isCur) {
            vText = get_heart();
            str = "暂列第一";
        } else {
            vText = get_heart();
            str = "位列第一";
        }
        vText.setText(str);
        get_name().setHeight(t100.p);
        get_heart().setHeight(t100.n);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_avatar_bottom(@NotNull View view) {
        view.getClass();
        this._avatar_bottom = view;
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_crown(@NotNull VImage vImage) {
        vImage.getClass();
        this._crown = vImage;
    }

    public final void set_heart(@NotNull VText vText) {
        vText.getClass();
        this._heart = vText;
    }

    public final void set_living(@NotNull LivingNewTagView livingNewTagView) {
        livingNewTagView.getClass();
        this._living = livingNewTagView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_rank(@NotNull VText vText) {
        vText.getClass();
        this._rank = vText;
    }

    public final void set_rank_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._rank_icon = vImage;
    }

    public final void set_rank_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._rank_svga = animEffectPlayer;
    }

    public final void set_root(@NotNull HourBoardFirstView hourBoardFirstView) {
        hourBoardFirstView.getClass();
        this._root = hourBoardFirstView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardFirstView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
