package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bt0;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.xdl0;
import l.ypv;
import p002l.f0t;
import p002l.i3c0;
import p002l.isk;
import p002l.pm0;
import p002l.trk;
import p002l.zqs;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AnchorGuardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f6447d;

    /* JADX INFO: renamed from: e */
    public VImage f6448e;

    /* JADX INFO: renamed from: f */
    public VImage f6449f;

    /* JADX INFO: renamed from: g */
    public VText f6450g;

    /* JADX INFO: renamed from: h */
    public VText f6451h;

    /* JADX INFO: renamed from: i */
    public VImage f6452i;

    /* JADX INFO: renamed from: j */
    public View f6453j;

    /* JADX INFO: renamed from: k */
    public View f6454k;

    /* JADX INFO: renamed from: l */
    public RecyclerView f6455l;

    /* JADX INFO: renamed from: m */
    public Group f6456m;

    /* JADX INFO: renamed from: n */
    public VImage f6457n;

    /* JADX INFO: renamed from: o */
    public VText f6458o;

    /* JADX INFO: renamed from: p */
    public BLiveGuardType f6459p;

    /* JADX INFO: renamed from: q */
    public isk f6460q;

    /* JADX INFO: renamed from: r */
    public trk f6461r;

    public AnchorGuardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    private void m8212B0(List<f0t> list) {
        m8222z0(list.size() == 0);
        if (NullChecker.a(this.f6461r)) {
            this.f6461r.m23158G(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m8220s0(View view) {
        m8225p0(BLiveGuardType.get("onlineGuard"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m8221t0(View view) {
        m8225p0(BLiveGuardType.get("potentialGuard"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    private void m8222z0(boolean z) {
        xdl0.M0(this.f6456m, z);
        xdl0.M0(this.f6455l, !z);
        this.f6457n.setBackground(getResources().getDrawable(i3c0.f12485F2));
        this.f6458o.setText(getResources().getText(R$string.f3039U9));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m8223D0(final boolean z, final boolean z2) {
        this.f6451h.post(new Runnable() { // from class: l.lm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14947a.m8230w0(z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8224o0(View view) {
        pm0.m20476a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8224o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8225p0(BLiveGuardType bLiveGuardType) {
        m8226q0(bLiveGuardType, true, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m8226q0(BLiveGuardType bLiveGuardType, boolean z, boolean z2) {
        if (z2 || !TEnum.equals(this.f6459p, bLiveGuardType)) {
            this.f6459p = bLiveGuardType;
            m8223D0(TEnum.equals(bLiveGuardType, "potentialGuard"), z);
            this.f6450g.setSelected(TEnum.equals(bLiveGuardType, "potentialGuard"));
            this.f6451h.setSelected(TEnum.equals(bLiveGuardType, "onlineGuard"));
            m8212B0(this.f6460q.m15363p4(bLiveGuardType));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m8227r0(final isk iskVar) {
        this.f6460q = iskVar;
        xdl0.E0(this.f6451h, new View.OnClickListener() { // from class: l.mm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15451a.m8220s0(view);
            }
        });
        xdl0.E0(this.f6450g, new View.OnClickListener() { // from class: l.nm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16101a.m8221t0(view);
            }
        });
        xdl0.E0(this.f6452i, new View.OnClickListener() { // from class: l.om0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iskVar.m15343I4();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8228u0(String str) {
        this.f6460q.m15350N4(str);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8229v0(BLiveAnchorKnightInfos bLiveAnchorKnightInfos) {
        if (!NullChecker.a(bLiveAnchorKnightInfos)) {
            m8222z0(true);
            return;
        }
        this.f6455l.setLayoutManager(new LinearLayoutManager(this.f6460q.act()));
        this.f6455l.setAdapter(this.f6461r);
        m8212B0(this.f6460q.m15363p4(this.f6459p));
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8230w0(boolean z, boolean z2) {
        int i = xdl0.i0(this.f6451h).a - xdl0.i0(this.f6450g).a;
        if (z) {
            i = 0;
        }
        View view = this.f6454k;
        if (z2) {
            bt0.p(view, "translationX", 0L, 100L, new LinearInterpolator(), new float[]{i}).start();
        } else {
            view.setTranslationX(i);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m8231y0(final zqs zqsVar) {
        this.f6459p = zqsVar.m27509B();
        m8227r0((isk) zqsVar.f3748b);
        xdl0.E0(this.f6449f, new View.OnClickListener() { // from class: l.im0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27521O();
            }
        });
        BLiveGuardType bLiveGuardType = this.f6459p;
        if (bLiveGuardType == null || TEnum.equals(bLiveGuardType, "anchorGuard")) {
            this.f6459p = BLiveGuardType.get("potentialGuard");
        }
        m8226q0(this.f6459p, false, true);
        this.f6461r = new trk(new e30() { // from class: l.jm0
            public final void call(Object obj) {
                this.f13867a.m8228u0((String) obj);
            }
        });
        if (NullChecker.a(zqsVar.f3748b)) {
            ((isk) zqsVar.f3748b).m27393J3(((ggv) ypv.l(fld0.c)).f).take(2).subscribe(ffw.d(new e30() { // from class: l.km0
                public final void call(Object obj) {
                    this.f14377a.m8229v0((BLiveAnchorKnightInfos) obj);
                }
            }));
        }
    }

    public AnchorGuardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
