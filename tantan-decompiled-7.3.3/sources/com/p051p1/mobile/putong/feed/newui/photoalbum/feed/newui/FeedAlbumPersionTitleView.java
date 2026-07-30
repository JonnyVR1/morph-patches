package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.newui;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.i4g0;
import p153l.jyb;
import p153l.ksg;
import p153l.o1j0;
import p153l.orb0;
import p153l.qa00;
import p153l.qng;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAlbumPersionTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedAlbumPersionTitleView f42516d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42517e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42518f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f42519g;

    /* JADX INFO: renamed from: h */
    public VText f42520h;

    /* JADX INFO: renamed from: i */
    public VImage f42521i;

    /* JADX INFO: renamed from: j */
    public FeedUserSexAndAgeView f42522j;

    /* JADX INFO: renamed from: k */
    public VImage f42523k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f42524l;

    /* JADX INFO: renamed from: m */
    public ODiamondTagLabel f42525m;

    /* JADX INFO: renamed from: n */
    public VText f42526n;

    /* JADX INFO: renamed from: o */
    public VText f42527o;

    /* JADX INFO: renamed from: p */
    public VLinear f42528p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f42529q;

    /* JADX INFO: renamed from: r */
    public VText f42530r;

    /* JADX INFO: renamed from: s */
    public FeedWriterLevelInProfileView f42531s;

    /* JADX INFO: renamed from: t */
    public String f42532t;

    public FeedAlbumPersionTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m65592h0(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m65593i0(BubbleInfo bubbleInfo, User user, PhotoAlbumFeedAct photoAlbumFeedAct, View view) {
        if (bubbleInfo == null) {
            return;
        }
        i4g0.m138523u("e_other_state", "p_album", jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        if (!bubbleInfo.checkStateTimeIsValid()) {
            o1j0.m165636j("状态已结束");
            return;
        }
        if (user.isMe()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m66746r2(photoAlbumFeedAct, arrayList, 0, "", "p_album"));
        } else if (ksg.m151186U(FeedModule.m61406H().mo31744Zj(user.f56859id))) {
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m66744q2(photoAlbumFeedAct, bubbleInfo.f39578id, bubbleInfo.owner.f39651id, true, "p_album"));
        } else {
            FeedModule.m61406H().mo31741Yn(photoAlbumFeedAct, bubbleInfo.owner.f39651id, bubbleInfo.f39578id, "p_album", ksg.m151158C("p_album"), false, "");
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m65594j0(View view) {
        qng.m177213a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m65595k0() {
        bnl0.m105524M(this.f42528p, false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m65596l0() {
        if (User.isWisdomStar(this.f42532t)) {
            this.f42526n.setMaxLines(3);
            bnl0.m105539W(this.f42526n, qa00.f156326m);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m65597m0(User user) {
        StringBuilder sb = new StringBuilder();
        String strM151155A0 = ksg.m151155A0(user);
        String strM151243z0 = ksg.m151243z0(user);
        boolean zEquals = FeedModule.m61405F().userId().equals(this.f42532t);
        if (!TextUtils.isEmpty(strM151155A0) && !zEquals && !user.isTeamAccount()) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM151155A0);
        }
        if (!TextUtils.isEmpty(strM151243z0)) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM151243z0);
        }
        this.f42527o.setText(sb.toString());
        bnl0.m105524M(this.f42522j, true);
        this.f42522j.m67558d(user, 6, 2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m65598n0(User user, String str, final x20 x20Var) {
        if (user == null) {
            CrashHelper.m82479c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + user.f56859id));
            return;
        }
        this.f42532t = str;
        uqb0.f180374G.m127109I0(this.f42518f, user.m61308fp().profileMiddle().formatted(), qa00.m175859d(90.0f), qa00.m175859d(120.0f));
        this.f42520h.setText(user.name);
        TextPaint paint = this.f42520h.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(true);
        }
        uqb0.f180396b0.f170325b.showUserVerificationLogo(act(), user, this.f42521i);
        bnl0.m105524M(this.f42524l, false);
        bnl0.m105524M(this.f42525m, false);
        orb0.m168908y(act(), user, this.f42523k, true, false);
        if (this.f42523k.getVisibility() == 0) {
            VImage vImage = this.f42523k;
            m65600p0(vImage, vImage.getDrawable(), this.f42523k.getLayoutParams().height);
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f42526n.setVisibility(0);
            this.f42526n.setText(user.description);
        }
        m65597m0(user);
        bnl0.m105509E0(this.f42518f, new View.OnClickListener() { // from class: l.ong
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m65592h0(x20Var, view);
            }
        });
        m65596l0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m65599o0(final User user, final PhotoAlbumFeedAct photoAlbumFeedAct, String str, final BubbleInfo bubbleInfo) {
        if (TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        if (bubbleInfo == null) {
            bnl0.m105524M(this.f42528p, false);
            return;
        }
        i4g0.m138492A("e_other_state", "p_album", jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        bnl0.m105524M(this.f42528p, true);
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f42529q;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156330q;
        fsb0Var.m127109I0(vDraweeView, str2, i, i);
        this.f42530r.getPaint().setFakeBoldText(true);
        this.f42530r.setText(bubbleInfo.emotion.text);
        bnl0.m105509E0(this.f42528p, new View.OnClickListener() { // from class: l.png
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m65593i0(bubbleInfo, user, photoAlbumFeedAct, view);
            }
        });
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m65594j0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m65600p0(View view, Drawable drawable, int i) {
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
