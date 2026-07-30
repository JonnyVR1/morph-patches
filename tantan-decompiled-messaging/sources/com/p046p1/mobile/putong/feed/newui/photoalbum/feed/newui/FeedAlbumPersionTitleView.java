package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.newui;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.bkb0;
import p149l.bmg;
import p149l.d30;
import p149l.kjb0;
import p149l.lsi0;
import p149l.qib0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAlbumPersionTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedAlbumPersionTitleView f41668d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f41669e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f41670f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f41671g;

    /* JADX INFO: renamed from: h */
    public VText f41672h;

    /* JADX INFO: renamed from: i */
    public VImage f41673i;

    /* JADX INFO: renamed from: j */
    public FeedUserSexAndAgeView f41674j;

    /* JADX INFO: renamed from: k */
    public VImage f41675k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f41676l;

    /* JADX INFO: renamed from: m */
    public ODiamondTagLabel f41677m;

    /* JADX INFO: renamed from: n */
    public VText f41678n;

    /* JADX INFO: renamed from: o */
    public VText f41679o;

    /* JADX INFO: renamed from: p */
    public VLinear f41680p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f41681q;

    /* JADX INFO: renamed from: r */
    public VText f41682r;

    /* JADX INFO: renamed from: s */
    public FeedWriterLevelInProfileView f41683s;

    /* JADX INFO: renamed from: t */
    public String f41684t;

    public FeedAlbumPersionTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m64409h0(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m64410i0(BubbleInfo bubbleInfo, User user, PhotoAlbumFeedAct photoAlbumFeedAct, View view) {
        if (bubbleInfo == null) {
            return;
        }
        zvf0.m220399u("e_other_state", "p_album", vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        if (!bubbleInfo.checkStateTimeIsValid()) {
            lsi0.m151580j("状态已结束");
            return;
        }
        if (user.isMe()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m65561q2(photoAlbumFeedAct, arrayList, 0, "", "p_album"));
        } else if (vqg.m199527U(FeedModule.m60222H().mo30741Zj(user.f56011id))) {
            photoAlbumFeedAct.startActivity(FeedStatusPageAct.m65560p2(photoAlbumFeedAct, bubbleInfo.f38730id, bubbleInfo.owner.f38803id, true, "p_album"));
        } else {
            FeedModule.m60222H().mo30738Yn(photoAlbumFeedAct, bubbleInfo.owner.f38803id, bubbleInfo.f38730id, "p_album", vqg.m199499C("p_album"), false, "");
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m64411j0(View view) {
        bmg.m102654a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m64412k0() {
        xdl0.m208344M(this.f41680p, false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m64413l0() {
        if (User.isWisdomStar(this.f41684t)) {
            this.f41678n.setMaxLines(3);
            xdl0.m208359W(this.f41678n, t100.f167264m);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m64414m0(User user) {
        StringBuilder sb = new StringBuilder();
        String strM199496A0 = vqg.m199496A0(user);
        String strM199584z0 = vqg.m199584z0(user);
        boolean zEquals = FeedModule.m60221F().userId().equals(this.f41684t);
        if (!TextUtils.isEmpty(strM199496A0) && !zEquals && !user.isTeamAccount()) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM199496A0);
        }
        if (!TextUtils.isEmpty(strM199584z0)) {
            if (!sb.toString().isEmpty()) {
                sb.append("  •  ");
            }
            sb.append(strM199584z0);
        }
        this.f41679o.setText(sb.toString());
        xdl0.m208344M(this.f41674j, true);
        this.f41674j.m66375d(user, 6, 2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m64415n0(User user, String str, final d30 d30Var) {
        if (user == null) {
            CrashHelper.m81296c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + user.f56011id));
            return;
        }
        this.f41684t = str;
        qib0.f154691G.m102325I0(this.f41670f, user.m60124fp().profileMiddle().formatted(), t100.m186890d(90.0f), t100.m186890d(120.0f));
        this.f41672h.setText(user.name);
        TextPaint paint = this.f41672h.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(true);
        }
        qib0.f154713b0.f139231b.showUserVerificationLogo(act(), user, this.f41673i);
        xdl0.m208344M(this.f41676l, false);
        xdl0.m208344M(this.f41677m, false);
        kjb0.m146214y(act(), user, this.f41675k, true, false);
        if (this.f41675k.getVisibility() == 0) {
            VImage vImage = this.f41675k;
            m64417p0(vImage, vImage.getDrawable(), this.f41675k.getLayoutParams().height);
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f41678n.setVisibility(0);
            this.f41678n.setText(user.description);
        }
        m64414m0(user);
        xdl0.m208329E0(this.f41670f, new View.OnClickListener() { // from class: l.zlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m64409h0(d30Var, view);
            }
        });
        m64413l0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m64416o0(final User user, final PhotoAlbumFeedAct photoAlbumFeedAct, String str, final BubbleInfo bubbleInfo) {
        if (TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        if (bubbleInfo == null) {
            xdl0.m208344M(this.f41680p, false);
            return;
        }
        zvf0.m220368A("e_other_state", "p_album", vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        xdl0.m208344M(this.f41680p, true);
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f41681q;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167268q;
        bkb0Var.m102325I0(vDraweeView, str2, i, i);
        this.f41682r.getPaint().setFakeBoldText(true);
        this.f41682r.setText(bubbleInfo.emotion.text);
        xdl0.m208329E0(this.f41680p, new View.OnClickListener() { // from class: l.amg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedAlbumPersionTitleView.m64410i0(bubbleInfo, user, photoAlbumFeedAct, view);
            }
        });
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m64411j0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m64417p0(View view, Drawable drawable, int i) {
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
