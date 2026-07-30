package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.ats;
import p153l.bnl0;
import p153l.dhw;
import p153l.g2t;
import p153l.gt0;
import p153l.hiv;
import p153l.htd0;
import p153l.juk;
import p153l.lm0;
import p153l.obc0;
import p153l.y20;
import p153l.yuk;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorGuardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f51253d;

    /* JADX INFO: renamed from: e */
    public VImage f51254e;

    /* JADX INFO: renamed from: f */
    public VImage f51255f;

    /* JADX INFO: renamed from: g */
    public VText f51256g;

    /* JADX INFO: renamed from: h */
    public VText f51257h;

    /* JADX INFO: renamed from: i */
    public VImage f51258i;

    /* JADX INFO: renamed from: j */
    public View f51259j;

    /* JADX INFO: renamed from: k */
    public View f51260k;

    /* JADX INFO: renamed from: l */
    public RecyclerView f51261l;

    /* JADX INFO: renamed from: m */
    public Group f51262m;

    /* JADX INFO: renamed from: n */
    public VImage f51263n;

    /* JADX INFO: renamed from: o */
    public VText f51264o;

    /* JADX INFO: renamed from: p */
    public BLiveGuardType f51265p;

    /* JADX INFO: renamed from: q */
    public yuk f51266q;

    /* JADX INFO: renamed from: r */
    public juk f51267r;

    public AnchorGuardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    private void m75802B0(List<g2t> list) {
        m75812z0(list.size() == 0);
        if (NullChecker.m82486a(this.f51267r)) {
            this.f51267r.m146991G(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m75810s0(View view) {
        m75815p0(BLiveGuardType.get(BLiveGuardType.onlineGuard));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m75811t0(View view) {
        m75815p0(BLiveGuardType.get(BLiveGuardType.potentialGuard));
    }

    /* JADX INFO: renamed from: z0 */
    private void m75812z0(boolean z) {
        bnl0.m105525M0(this.f51262m, z);
        bnl0.m105525M0(this.f51261l, !z);
        this.f51263n.setBackground(getResources().getDrawable(obc0.f146028F2));
        this.f51264o.setText(getResources().getText(R$string.f47845U9));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m75813D0(final boolean z, final boolean z2) {
        this.f51257h.post(new Runnable() { // from class: l.hm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110565a.m75820w0(z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75814o0(View view) {
        lm0.m154824a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75814o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75815p0(BLiveGuardType bLiveGuardType) {
        m75816q0(bLiveGuardType, true, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75816q0(BLiveGuardType bLiveGuardType, boolean z, boolean z2) {
        if (z2 || !TEnum.equals(this.f51265p, bLiveGuardType)) {
            this.f51265p = bLiveGuardType;
            m75813D0(TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard), z);
            this.f51256g.setSelected(TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard));
            this.f51257h.setSelected(TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard));
            m75802B0(this.f51266q.m217424p4(bLiveGuardType));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m75817r0(final yuk yukVar) {
        this.f51266q = yukVar;
        bnl0.m105509E0(this.f51257h, new View.OnClickListener() { // from class: l.im0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115639a.m75810s0(view);
            }
        });
        bnl0.m105509E0(this.f51256g, new View.OnClickListener() { // from class: l.jm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121632a.m75811t0(view);
            }
        });
        bnl0.m105509E0(this.f51258i, new View.OnClickListener() { // from class: l.km0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yukVar.m217406I4();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m75818u0(String str) {
        this.f51266q.m217411N4(str);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m75819v0(BLiveAnchorKnightInfos bLiveAnchorKnightInfos) {
        if (!NullChecker.m82486a(bLiveAnchorKnightInfos)) {
            m75812z0(true);
            return;
        }
        this.f51261l.setLayoutManager(new LinearLayoutManager(this.f51266q.act()));
        this.f51261l.setAdapter(this.f51267r);
        m75802B0(this.f51266q.m217424p4(this.f51265p));
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m75820w0(boolean z, boolean z2) {
        int i = bnl0.m105560i0(this.f51257h).f77559a - bnl0.m105560i0(this.f51256g).f77559a;
        if (z) {
            i = 0;
        }
        View view = this.f51260k;
        if (z2) {
            gt0.m132170p(view, "translationX", 0L, 100L, new LinearInterpolator(), i).start();
        } else {
            view.setTranslationX(i);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m75821y0(final ats atsVar) {
        this.f51265p = atsVar.m100247B();
        m75817r0((yuk) atsVar.f48554b);
        bnl0.m105509E0(this.f51255f, new View.OnClickListener() { // from class: l.em0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100259O();
            }
        });
        BLiveGuardType bLiveGuardType = this.f51265p;
        if (bLiveGuardType == null || TEnum.equals(bLiveGuardType, BLiveGuardType.anchorGuard)) {
            this.f51265p = BLiveGuardType.get(BLiveGuardType.potentialGuard);
        }
        m75816q0(this.f51265p, false, true);
        this.f51267r = new juk(new y20() { // from class: l.fm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99705a.m75818u0((String) obj);
            }
        });
        if (NullChecker.m82486a(atsVar.f48554b)) {
            ((yuk) atsVar.f48554b).m135318J3(((hiv) zrv.m221194l(htd0.f111521c)).f110075f).take(2).subscribe(dhw.m115825d(new y20() { // from class: l.gm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104904a.m75819v0((BLiveAnchorKnightInfos) obj);
                }
            }));
        }
    }

    public AnchorGuardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
