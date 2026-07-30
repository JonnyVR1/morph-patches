package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.f0t;
import p149l.ffw;
import p149l.fld0;
import p149l.ggv;
import p149l.i3c0;
import p149l.isk;
import p149l.pm0;
import p149l.trk;
import p149l.xdl0;
import p149l.ypv;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorGuardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f50405d;

    /* JADX INFO: renamed from: e */
    public VImage f50406e;

    /* JADX INFO: renamed from: f */
    public VImage f50407f;

    /* JADX INFO: renamed from: g */
    public VText f50408g;

    /* JADX INFO: renamed from: h */
    public VText f50409h;

    /* JADX INFO: renamed from: i */
    public VImage f50410i;

    /* JADX INFO: renamed from: j */
    public View f50411j;

    /* JADX INFO: renamed from: k */
    public View f50412k;

    /* JADX INFO: renamed from: l */
    public RecyclerView f50413l;

    /* JADX INFO: renamed from: m */
    public Group f50414m;

    /* JADX INFO: renamed from: n */
    public VImage f50415n;

    /* JADX INFO: renamed from: o */
    public VText f50416o;

    /* JADX INFO: renamed from: p */
    public BLiveGuardType f50417p;

    /* JADX INFO: renamed from: q */
    public isk f50418q;

    /* JADX INFO: renamed from: r */
    public trk f50419r;

    public AnchorGuardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    private void m74619B0(List<f0t> list) {
        m74629z0(list.size() == 0);
        if (NullChecker.m81303a(this.f50419r)) {
            this.f50419r.m190424G(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m74627s0(View view) {
        m74632p0(BLiveGuardType.get(BLiveGuardType.onlineGuard));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m74628t0(View view) {
        m74632p0(BLiveGuardType.get(BLiveGuardType.potentialGuard));
    }

    /* JADX INFO: renamed from: z0 */
    private void m74629z0(boolean z) {
        xdl0.m208345M0(this.f50414m, z);
        xdl0.m208345M0(this.f50413l, !z);
        this.f50415n.setBackground(getResources().getDrawable(i3c0.f110700F2));
        this.f50416o.setText(getResources().getText(R$string.f46997U9));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m74630D0(final boolean z, final boolean z2) {
        this.f50409h.post(new Runnable() { // from class: l.lm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128763a.m74637w0(z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74631o0(View view) {
        pm0.m170291a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74631o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74632p0(BLiveGuardType bLiveGuardType) {
        m74633q0(bLiveGuardType, true, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m74633q0(BLiveGuardType bLiveGuardType, boolean z, boolean z2) {
        if (z2 || !TEnum.equals(this.f50417p, bLiveGuardType)) {
            this.f50417p = bLiveGuardType;
            m74630D0(TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard), z);
            this.f50408g.setSelected(TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard));
            this.f50409h.setSelected(TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard));
            m74619B0(this.f50418q.m138024p4(bLiveGuardType));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m74634r0(final isk iskVar) {
        this.f50418q = iskVar;
        xdl0.m208329E0(this.f50409h, new View.OnClickListener() { // from class: l.mm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134543a.m74627s0(view);
            }
        });
        xdl0.m208329E0(this.f50408g, new View.OnClickListener() { // from class: l.nm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139605a.m74628t0(view);
            }
        });
        xdl0.m208329E0(this.f50410i, new View.OnClickListener() { // from class: l.om0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iskVar.m138005I4();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m74635u0(String str) {
        this.f50418q.m138011N4(str);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m74636v0(BLiveAnchorKnightInfos bLiveAnchorKnightInfos) {
        if (!NullChecker.m81303a(bLiveAnchorKnightInfos)) {
            m74629z0(true);
            return;
        }
        this.f50413l.setLayoutManager(new LinearLayoutManager(this.f50418q.act()));
        this.f50413l.setAdapter(this.f50419r);
        m74619B0(this.f50418q.m138024p4(this.f50417p));
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m74637w0(boolean z, boolean z2) {
        int i = xdl0.m208380i0(this.f50409h).f192418a - xdl0.m208380i0(this.f50408g).f192418a;
        if (z) {
            i = 0;
        }
        View view = this.f50412k;
        if (z2) {
            bt0.m103743p(view, "translationX", 0L, 100L, new LinearInterpolator(), i).start();
        } else {
            view.setTranslationX(i);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m74638y0(final zqs zqsVar) {
        this.f50417p = zqsVar.m219881B();
        m74634r0((isk) zqsVar.f47706b);
        xdl0.m208329E0(this.f50407f, new View.OnClickListener() { // from class: l.im0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219893O();
            }
        });
        BLiveGuardType bLiveGuardType = this.f50417p;
        if (bLiveGuardType == null || TEnum.equals(bLiveGuardType, BLiveGuardType.anchorGuard)) {
            this.f50417p = BLiveGuardType.get(BLiveGuardType.potentialGuard);
        }
        m74633q0(this.f50417p, false, true);
        this.f50419r = new trk(new e30() { // from class: l.jm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118605a.m74635u0((String) obj);
            }
        });
        if (NullChecker.m81303a(zqsVar.f47706b)) {
            ((isk) zqsVar.f47706b).m218909J3(((ggv) ypv.m215673l(fld0.f98148c)).f102545f).take(2).subscribe(ffw.m121193d(new e30() { // from class: l.km0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123728a.m74636v0((BLiveAnchorKnightInfos) obj);
                }
            }));
        }
    }

    public AnchorGuardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
