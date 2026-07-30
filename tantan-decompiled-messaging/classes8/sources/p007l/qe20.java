package p007l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.putong.core.p006ui.VText_Medium;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.data.CommonData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.az2;
import l.dac0;
import l.dsj0;
import l.dze;
import l.e3c0;
import l.exb;
import l.ez2;
import l.k960;
import l.n6c0;
import l.smr;
import l.sx2;
import l.t100;
import l.vx2;
import l.xdl0;
import l.yx2;
import l.yy50;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qe20 extends dac0<ez2> {

    /* JADX INFO: renamed from: c */
    public final int f3854c = 1;

    /* JADX INFO: renamed from: d */
    public final int f3855d = 2;

    /* JADX INFO: renamed from: e */
    public final int f3856e = 3;

    /* JADX INFO: renamed from: f */
    public final int f3857f = 4;

    /* JADX INFO: renamed from: g */
    public List<ez2> f3858g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Act f3859h;

    /* JADX INFO: renamed from: i */
    public CommonData f3860i;

    public qe20(Act act) {
        this.f3859h = act;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m10336G(ez2 ez2Var) {
        return ez2Var instanceof dze;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m10337H(ez2 ez2Var) {
        return (ez2Var instanceof sx2) || (ez2Var instanceof az2) || (ez2Var instanceof vx2) || (ez2Var instanceof yx2) || (ez2Var instanceof dsj0);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m10338I(ez2 ez2Var) {
        return (ez2Var instanceof exb) || (ez2Var instanceof yy50) || (ez2Var instanceof k960);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10339J(ez2 ez2Var) {
        return ez2Var instanceof smr;
    }

    /* JADX INFO: renamed from: C */
    public int m10341C() {
        return this.f3858g.size();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D */
    public View m10342D(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return this.f3859h.inflater().inflate(n6c0.s0, viewGroup, false);
        }
        if (i == 2) {
            VText vText_Medium = new VText_Medium(this.f3859h);
            vText_Medium.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            vText_Medium.setTextSize(15.0f);
            int i2 = t100.o;
            vText_Medium.setPadding(i2, 0, i2, t100.e);
            vText_Medium.setTextColor(Color.parseColor("#4D000000"));
            return vText_Medium;
        }
        if (i != 4) {
            View view = new View(this.f3859h);
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, t100.q));
            return view;
        }
        VText vText_Medium2 = new VText_Medium(this.f3859h);
        vText_Medium2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i3 = t100.o;
        int i4 = t100.i;
        vText_Medium2.setPadding(i3, i4, i3, i4);
        vText_Medium2.setTextSize(12.0f);
        vText_Medium2.setTextColor(Color.parseColor("#FF6244"));
        Drawable drawable = this.f3859h.getDrawable(e3c0.z1);
        if (NullChecker.a(drawable)) {
            int i5 = t100.k;
            drawable.setBounds(0, 0, i5, i5);
            vText_Medium2.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            vText_Medium2.setCompoundDrawablePadding(t100.e);
        }
        vText_Medium2.setText(R.string.P1);
        xdl0.U(vText_Medium2, t100.e);
        vText_Medium2.setBackgroundColor(Color.parseColor("#14FF6244"));
        return vText_Medium2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m10340A(View view, ez2 ez2Var, int i, int i2) {
        ez2 item = getItem(i2);
        if (i == 3) {
            item.a((AccountSecureFunItem) view, this.f3860i);
        } else if (i == 2) {
            ((VText_Medium) view).setText(item.a);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ez2 getItem(int i) {
        return this.f3858g.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m10345K(@NonNull List<ez2> list, CommonData commonData) {
        this.f3858g = list;
        this.f3860i = commonData;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        ez2 item = getItem(i);
        if (m10337H(item)) {
            return 3;
        }
        if (m10338I(item)) {
            return 2;
        }
        if (m10336G(item)) {
            return 1;
        }
        return m10339J(item) ? 4 : 0;
    }
}
