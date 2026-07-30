package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wc3 {

    /* JADX INFO: renamed from: a */
    public View f185639a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f185640b;

    /* JADX INFO: renamed from: c */
    public VText f185641c;

    /* JADX INFO: renamed from: d */
    public VImage f185642d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f185643e;

    /* JADX INFO: renamed from: f */
    public VButton f185644f;

    /* JADX INFO: renamed from: g */
    public VText f185645g;

    /* JADX INFO: renamed from: h */
    public VText f185646h;

    /* JADX INFO: renamed from: i */
    public VText f185647i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f185648j;

    /* JADX INFO: renamed from: k */
    public c4g0 f185649k;

    /* JADX INFO: renamed from: l */
    public final pfe0 f185650l;

    /* JADX INFO: renamed from: m */
    public final DialogC12611a f185651m;

    public wc3(pfe0 pfe0Var) {
        this.f185650l = pfe0Var;
        DialogC12611a dialogC12611a = new DialogC12611a(pfe0Var, t6c0.f168557w, j2g0.m139458e(true));
        this.f185651m = dialogC12611a;
        dialogC12611a.m71776h0(new e30() { // from class: l.qc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153725a.m202610i((View) obj);
            }
        });
        dialogC12611a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rc3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f158712a.m202612k(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m202610i(View view) {
        xc3.m208064a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m202611j() {
        if (NullChecker.m81303a(this.f185650l)) {
            this.f185650l.m168637u4();
        }
        DialogC12611a dialogC12611a = this.f185651m;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f185651m.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m202612k(DialogInterface dialogInterface) {
        mkd0.m154992z(this.f185649k);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m202613l(View view) {
        VRadioButton vRadioButton = this.f185648j;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m202614m(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m202611j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m202615n(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        m202611j();
        this.f185650l.m168635s4(this.f185648j.isSelected(), bLiveGiftBubbleConfig.type, "close");
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m202616o(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, d30 d30Var, View view) {
        m202611j();
        this.f185650l.m168635s4(this.f185648j.isSelected(), bLiveGiftBubbleConfig.type, "");
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m202617p(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f185648j.isSelected()) {
            fld0<bgv> fld0Var = fld0.f98151f;
            HashSet<String> hashSet = ((bgv) ypv.m215673l(fld0Var)).f75516p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((bgv) ypv.m215673l(fld0Var)).f75516p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m202618q(Long l2) {
        m202611j();
    }

    /* JADX INFO: renamed from: r */
    public final void m202619r(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(bLiveGiftBubbleConfig.isCircle);
        this.f185643e.getHierarchy().m112053H(roundingParams);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl);
        VDraweeView vDraweeView = this.f185643e;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133406s("context_single_room", this.f185643e, bLiveGiftBubbleConfig.iconUrl);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m202620s(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        xdl0.m208344M(this.f185648j, bLiveGiftBubbleConfig.remind.show);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.remind.textColor)) {
            this.f185648j.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.remind.textColor));
        }
        this.f185648j.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f185648j.setOnClickListener(new View.OnClickListener() { // from class: l.vc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180906a.m202613l(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m202621t(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f185639a.setOnClickListener(new View.OnClickListener() { // from class: l.sc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163704a.m202614m(bLiveGiftBubbleConfig, view);
            }
        });
        xdl0.m208344M(this.f185642d, bLiveGiftBubbleConfig.showClose && (bLiveGiftBubbleConfig.isTitlePositionMiddle() || bLiveGiftBubbleConfig.isTitlePositionCenter()));
        this.f185642d.setOnClickListener(new View.OnClickListener() { // from class: l.tc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169411a.m202615n(bLiveGiftBubbleConfig, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m202622u(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.backgroundColor)) {
            this.f185640b.setBackgroundColor(zb2.m217816d(bLiveGiftBubbleConfig.backgroundColor));
            mep0.m154301c1(this.f185640b, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        }
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.contentColor)) {
            this.f185646h.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.contentColor));
        }
        this.f185646h.setText(bLiveGiftBubbleConfig.content);
    }

    /* JADX INFO: renamed from: v */
    public final void m202623v(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, final d30 d30Var) {
        xdl0.m208344M(this.f185644f, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.textColor)) {
            this.f185644f.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.button.textColor));
        }
        this.f185644f.setText(bLiveGiftBubbleConfig.bubbleText);
        this.f185644f.setOnClickListener(new View.OnClickListener() { // from class: l.uc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175789a.m202616o(bLiveGiftBubbleConfig, d30Var, view);
            }
        });
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            return;
        }
        float fM186890d = t100.m186890d(14.0f);
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
        this.f185644f.setBackground(xxj.m211501b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, new float[]{fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d}));
    }

    /* JADX INFO: renamed from: w */
    public final void m202624w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTitlePositionMiddle()) {
            xdl0.m208344M(this.f185641c, true);
            xdl0.m208344M(this.f185645g, false);
            xdl0.m208344M(this.f185647i, false);
            this.f185646h.setTextColor(-1);
            this.f185641c.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f185641c.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        boolean zIsTitlePositionCenter = bLiveGiftBubbleConfig.isTitlePositionCenter();
        VText vText = this.f185641c;
        if (!zIsTitlePositionCenter) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f185645g, true);
            xdl0.m208344M(this.f185647i, false);
            this.f185646h.setTextColor(kvc0.m147352a(h1c0.f105389n1));
            this.f185645g.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f185645g.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        xdl0.m208344M(vText, true);
        this.f185641c.setText(bLiveGiftBubbleConfig.title);
        xdl0.m208344M(this.f185647i, TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc);
        VText vText2 = this.f185645g;
        if (zIsEmpty) {
            vText2.setText("");
            this.f185646h.setText("");
            this.f185647i.setText(bLiveGiftBubbleConfig.content);
        } else {
            vText2.setText(bLiveGiftBubbleConfig.content);
            this.f185646h.setText(bLiveGiftBubbleConfig.contentDesc);
            this.f185647i.setText("");
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
            return;
        }
        this.f185641c.setTextColor(zb2.m217816d(bLiveGiftBubbleConfig.header.textColor));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: x */
    public DialogC12611a m202625x(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, d30 d30Var) {
        this.f185651m.show();
        this.f185651m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.oc3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f143007a.m202617p(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        m202622u(bLiveGiftBubbleConfig);
        m202621t(bLiveGiftBubbleConfig);
        m202624w(bLiveGiftBubbleConfig);
        m202623v(bLiveGiftBubbleConfig, d30Var);
        m202620s(bLiveGiftBubbleConfig);
        m202619r(bLiveGiftBubbleConfig);
        this.f185650l.m168636t4(this.f185648j.isSelected(), bLiveGiftBubbleConfig.type);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f185649k = C22306c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.pc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148136a.m202618q((Long) obj);
            }
        }));
        return this.f185651m;
    }
}
