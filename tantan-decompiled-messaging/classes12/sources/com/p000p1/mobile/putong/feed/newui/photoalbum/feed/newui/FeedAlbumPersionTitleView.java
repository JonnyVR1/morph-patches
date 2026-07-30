package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.newui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bkb0;
import l.d30;
import l.j760;
import l.lsi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.bmg;
import p007l.kjb0;
import p007l.vqg;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAlbumPersionTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedAlbumPersionTitleView f3129d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f3130e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3131f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f3132g;

    /* JADX INFO: renamed from: h */
    public VText f3133h;

    /* JADX INFO: renamed from: i */
    public VImage f3134i;

    /* JADX INFO: renamed from: j */
    public FeedUserSexAndAgeView f3135j;

    /* JADX INFO: renamed from: k */
    public VImage f3136k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f3137l;

    /* JADX INFO: renamed from: m */
    public ODiamondTagLabel f3138m;

    /* JADX INFO: renamed from: n */
    public VText f3139n;

    /* JADX INFO: renamed from: o */
    public VText f3140o;

    /* JADX INFO: renamed from: p */
    public VLinear f3141p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f3142q;

    /* JADX INFO: renamed from: r */
    public VText f3143r;

    /* JADX INFO: renamed from: s */
    public FeedWriterLevelInProfileView f3144s;

    /* JADX INFO: renamed from: t */
    public String f3145t;

    public FeedAlbumPersionTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m5489h0(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m5490i0(BubbleInfo bubbleInfo, User user, PhotoAlbumFeedAct photoAlbumFeedAct, View view) {
        if (bubbleInfo == null) {
            return;
        }
        zvf0.u("e_other_state", "p_album", new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id)});
        if (!bubbleInfo.checkStateTimeIsValid()) {
            lsi0.j("状态已结束");
            return;
        }
        if (user.isMe()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m6688q2(photoAlbumFeedAct, arrayList, 0, "", "p_album"));
        } else if (vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) user).id))) {
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m6687p2(photoAlbumFeedAct, bubbleInfo.f191id, bubbleInfo.owner.f264id, true, "p_album"));
        } else {
            FeedModule.m1140H().Yn(photoAlbumFeedAct, bubbleInfo.owner.f264id, bubbleInfo.f191id, "p_album", vqg.m15469C("p_album"), false, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m5491j0(View view) {
        bmg.m8945a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5492k0() {
        xdl0.M(this.f3141p, false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m5493l0() {
        if (User.isWisdomStar(this.f3145t)) {
            this.f3139n.setMaxLines(3);
            xdl0.W(this.f3139n, t100.m);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m5494m0(User user) {
        StringBuilder sb = new StringBuilder();
        String strM15466A0 = vqg.m15466A0(user);
        String strM15554z0 = vqg.m15554z0(user);
        boolean zEquals = FeedModule.m1139F().userId().equals(this.f3145t);
        if (!TextUtils.isEmpty(strM15466A0) && !zEquals && !user.isTeamAccount()) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM15466A0);
        }
        if (!TextUtils.isEmpty(strM15554z0)) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM15554z0);
        }
        this.f3140o.setText(sb.toString());
        xdl0.M(this.f3135j, true);
        this.f3135j.m7540d(user, 6, 2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m5495n0(User user, String str, final d30 d30Var) {
        if (user == null) {
            CrashHelper.c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + ((DbObject) user).id));
            return;
        }
        this.f3145t = str;
        qib0.G.I0(this.f3131f, user.m1042fp().profileMiddle().formatted(), t100.d(90.0f), t100.d(120.0f));
        this.f3133h.setText(user.name);
        TextPaint paint = this.f3133h.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(true);
        }
        qib0.b0.b.showUserVerificationLogo(act(), user, this.f3134i);
        xdl0.M(this.f3137l, false);
        xdl0.M(this.f3138m, false);
        kjb0.m11473y(act(), user, this.f3136k, true, false);
        if (this.f3136k.getVisibility() == 0) {
            VImage vImage = this.f3136k;
            m5497p0(vImage, vImage.getDrawable(), this.f3136k.getLayoutParams().height);
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f3139n.setVisibility(0);
            this.f3139n.setText(user.description);
        }
        m5494m0(user);
        xdl0.E0(this.f3131f, new View.OnClickListener() { // from class: l.zlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m5489h0(d30Var, view);
            }
        });
        m5493l0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m5496o0(final User user, final PhotoAlbumFeedAct photoAlbumFeedAct, String str, final BubbleInfo bubbleInfo) {
        if (TextUtils.isEmpty(((DbObject) user).id)) {
            return;
        }
        if (bubbleInfo == null) {
            xdl0.M(this.f3141p, false);
            return;
        }
        zvf0.A("e_other_state", "p_album", new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id)});
        xdl0.M(this.f3141p, true);
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f3142q;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.q;
        bkb0Var.I0(vDraweeView, str2, i, i);
        this.f3143r.getPaint().setFakeBoldText(true);
        this.f3143r.setText(bubbleInfo.emotion.text);
        xdl0.E0(this.f3141p, new View.OnClickListener() { // from class: l.amg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m5490i0(bubbleInfo, user, photoAlbumFeedAct, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5491j0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m5497p0(View view, Drawable drawable, int i) {
        if (view == null || drawable == null || i <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getPaddingLeft() + view.getPaddingRight() + ((drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight());
        view.setLayoutParams(layoutParams);
    }

    public FeedAlbumPersionTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
