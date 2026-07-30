package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveGiftUserInfoViewBindings;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import java.util.ArrayList;
import java.util.List;
import l.agv;
import l.dac0;
import l.lsi0;
import l.mqv;
import l.t100;
import l.v9j;
import l.w9j;
import l.xdl0;
import p002l.chs;
import p002l.d8c0;
import p002l.fp50;
import p002l.g5c0;
import p002l.mlj;
import p002l.mmj;
import p002l.mnj;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftUserInfoView extends LiveGiftUserInfoViewBindings<chs> {

    /* JADX INFO: renamed from: m */
    public mlj f6402m;

    /* JADX INFO: renamed from: n */
    public String f6403n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView$a */
    public static class C0435a extends dac0<mlj> {

        /* JADX INFO: renamed from: c */
        public final PopupWindow f6404c;

        /* JADX INFO: renamed from: d */
        public final List<mlj> f6405d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final String f6406e;

        /* JADX INFO: renamed from: f */
        public final chs<?> f6407f;

        public C0435a(PopupWindow popupWindow, String str, chs<?> chsVar) {
            this.f6404c = popupWindow;
            this.f6406e = str;
            this.f6407f = chsVar;
        }

        /* JADX INFO: renamed from: C */
        public int m8140C() {
            return this.f6405d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m8141D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f6404c.getContentView().getContext()).inflate(t6c0.f19529G1, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m8139A(View view, final mlj mljVar, int i, int i2) {
            CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) view.findViewById(g5c0.f11243x2);
            ((TextView) view.findViewById(g5c0.f11067e4)).setText(mmj.m18042C(mljVar));
            agv.d(commonMaskAvatarView, t100.v, mqv.f(mljVar).c(mljVar.f15446e.a, mljVar.f15443b, mljVar.f15442a), false, new w9j() { // from class: l.qxj
                public final Object call(Object obj) {
                    return ((mlj) obj).f15446e.c;
                }
            });
            final mnj mnjVarM18100d = new mnj.C0680a().m18101e(mljVar, this.f6406e).m18100d();
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f18716a.m8144I(mljVar, mnjVarM18100d, view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public mlj getItem(int i) {
            return this.f6405d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m8144I(mlj mljVar, mnj mnjVar, View view) {
            this.f6404c.dismiss();
            this.f6407f.m11052W3(new fp50().m13445i(700).m13446j(mljVar.f15448g).m13444h(mnjVar));
        }

        /* JADX INFO: renamed from: J */
        public void m8145J(List<mlj> list) {
            this.f6405d.clear();
            this.f6405d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public GiftUserInfoView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Nullable
    public mlj getCurrentGiftCallInfo() {
        chs chsVar;
        if (xdl0.O0(this) && (chsVar = this.f4002d) != null && TextUtils.equals("live", chsVar.m25547E2().mo14489A0())) {
            return this.f6402m;
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o0 */
    public final int m8128o0(List<mlj> list) {
        int size = (list.size() * t100.y) + t100.j;
        int[] iArr = new int[2];
        this.f4005g.getLocationOnScreen(iArr);
        return Math.min(size, xdl0.w0() - iArr[1]);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8129p0(mlj mljVar, View view) {
        this.f4002d.m11050U3(mljVar.f15446e.a, mljVar.f15448g);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8130q0(mlj mljVar, View view) {
        this.f4002d.m11049T3(mljVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8131r0(mlj mljVar, v9j v9jVar, View view) {
        if (mljVar.m18009i()) {
            return;
        }
        List<mlj> list = (List) v9jVar.call();
        if (list.size() <= 1) {
            lsi0.y("没有更多");
        } else {
            m8136w0(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m8132s0() {
        xdl0.M0(this.f4004f, true);
        xdl0.M0(this.f4007i, true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m8133t0(mnj mnjVar, v9j<List<mlj>> v9jVar) {
        mlj mljVarM18095g = mnjVar.m18095g();
        this.f6402m = mljVarM18095g;
        this.f6403n = mnjVar.m18090b();
        agv.d(this.f4005g, t100.v, mqv.f(mljVarM18095g).c(mljVarM18095g.f15446e.a, mljVarM18095g.f15443b, mljVarM18095g.f15442a), false, new w9j() { // from class: l.kxj
            public final Object call(Object obj) {
                return ((mlj) obj).f15446e.c;
            }
        });
        this.f4006h.setText(mmj.m18042C(mljVarM18095g));
        m8134u0(mljVarM18095g, v9jVar);
        m8135v0(mljVarM18095g);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8134u0(final mlj mljVar, final v9j<List<mlj>> v9jVar) {
        this.f4009k.setOnClickListener(new View.OnClickListener() { // from class: l.lxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15114a.m8129p0(mljVar, view);
            }
        });
        this.f4010l.setOnClickListener(new View.OnClickListener() { // from class: l.mxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15736a.m8130q0(mljVar, view);
            }
        });
        xdl0.E0(this.f4008j, new View.OnClickListener() { // from class: l.nxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16296a.m8131r0(mljVar, v9jVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m8135v0(mlj mljVar) {
        int iD;
        xdl0.M(this.f4010l, !mljVar.f15444c);
        boolean zM18009i = mljVar.m18009i();
        ImageView imageView = this.f4007i;
        if (zM18009i) {
            xdl0.M0(imageView, false);
            iD = (int) this.f4006h.getPaint().measureText(this.f4006h.getText().toString());
        } else {
            xdl0.M0(imageView, true);
            iD = t100.d(117.0f);
        }
        xdl0.D0(iD, new View[]{this.f4006h});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m8136w0(List<mlj> list) {
        View viewInflate = LayoutInflater.from(this.f4006h.getContext()).inflate(t6c0.f19517F1, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, t100.d(200.0f), m8128o0(list), true);
        popupWindow.setAnimationStyle(d8c0.f9100e);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(g5c0.f11000X4);
        View viewFindViewById = viewInflate.findViewById(g5c0.f10872J2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerViewFindViewById.setLayoutManager(linearLayoutManager);
        recyclerViewFindViewById.setHasFixedSize(true);
        C0435a c0435a = new C0435a(popupWindow, this.f6403n, this.f4002d);
        recyclerViewFindViewById.setAdapter(c0435a);
        c0435a.m8145J(list);
        xdl0.M0(this.f4004f, false);
        xdl0.M0(this.f4007i, false);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.oxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAsDropDown(this.f4005g, -t100.d(6.0f), -t100.d(49.0f));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.pxj
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f17713a.m8132s0();
            }
        });
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
