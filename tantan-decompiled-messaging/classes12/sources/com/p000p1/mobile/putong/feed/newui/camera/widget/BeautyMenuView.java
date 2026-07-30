package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.kpd0;
import p007l.jv2;
import p007l.zji;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f989a;

    /* JADX INFO: renamed from: b */
    public BeautyMenuItemView f990b;

    /* JADX INFO: renamed from: c */
    public BeautyMenuItemView f991c;

    /* JADX INFO: renamed from: d */
    public BeautyMenuItemView f992d;

    /* JADX INFO: renamed from: e */
    public BeautyValueTipSeekBar f993e;

    /* JADX INFO: renamed from: f */
    public zji f994f;

    /* JADX INFO: renamed from: g */
    public int f995g;

    /* JADX INFO: renamed from: h */
    public kpd0 f996h;

    /* JADX INFO: renamed from: i */
    public kpd0 f997i;

    /* JADX INFO: renamed from: j */
    public kpd0 f998j;

    /* JADX INFO: renamed from: k */
    public float f999k;

    /* JADX INFO: renamed from: l */
    public float f1000l;

    /* JADX INFO: renamed from: m */
    public float f1001m;

    /* JADX INFO: renamed from: n */
    public d30 f1002n;

    /* JADX INFO: renamed from: o */
    public boolean f1003o;

    /* JADX INFO: renamed from: p */
    public boolean f1004p;

    /* JADX INFO: renamed from: q */
    public boolean f1005q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView$a */
    public class C2008a implements SeekBar.OnSeekBarChangeListener {
        public C2008a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = BeautyMenuView.this.f995g;
            if (i2 == 1) {
                BeautyMenuView.this.f999k = i / 100.0f;
            } else if (i2 == 2) {
                BeautyMenuView.this.f1000l = i / 100.0f;
            } else if (i2 == 3) {
                BeautyMenuView.this.f1001m = i / 100.0f;
            }
            if (NullChecker.a(BeautyMenuView.this.f994f)) {
                BeautyMenuView.this.f994f.mo15050n(i / 100.0f, BeautyMenuView.this.f995g);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f996h = new kpd0("beauty_white_skin", 0.5d);
        this.f997i = new kpd0("beauty_big_eye", 0.30000001192092896d);
        this.f998j = new kpd0("beauty_thin_face", 0.375d);
        this.f1003o = true;
        this.f1004p = true;
        this.f1005q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m2366f(View view) {
        jv2.m11347a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m2367g() {
        return getContext();
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
    /* JADX INFO: renamed from: h */
    public final void m2368h(boolean z) {
        this.f993e.setEnabled(z);
    }

    /* JADX INFO: renamed from: i */
    public final void m2369i() {
        this.f990b.setSelected(false);
        this.f991c.setSelected(false);
        this.f992d.setSelected(false);
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
    /* JADX INFO: renamed from: j */
    public final void m2370j() {
        this.f999k = ((Double) this.f996h.get()).floatValue();
        this.f1000l = ((Double) this.f997i.get()).floatValue();
        this.f1001m = ((Double) this.f998j.get()).floatValue();
        this.f990b.setText(m2367g().getString(R$string.f645z0));
        this.f990b.setOnClickListener(this);
        this.f990b.setSelected(true);
        this.f995g = 1;
        this.f991c.setText(m2367g().getString(R$string.f597r0));
        this.f991c.setOnClickListener(this);
        this.f992d.setText(m2367g().getString(R$string.f603s0));
        this.f992d.setOnClickListener(this);
        this.f993e.setMax(100);
        this.f993e.setProgress((int) (this.f999k * 100.0f));
        if (NullChecker.a(this.f994f)) {
            this.f994f.mo15050n(this.f1001m, this.f995g);
            this.f994f.mo15050n(this.f999k, this.f995g);
            this.f994f.mo15050n(this.f1000l, this.f995g);
        }
        this.f993e.setOnSeekBarChangeListener(new C2008a());
        this.f989a.setOnClickListener(new View.OnClickListener() { // from class: l.iv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9139a.m2371k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m2371k(View view) {
        this.f996h.put(Double.valueOf(this.f999k));
        this.f997i.put(Double.valueOf(this.f1000l));
        this.f998j.put(Double.valueOf(this.f1001m));
        if (NullChecker.a(this.f1002n)) {
            this.f1002n.call();
        }
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
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m2369i();
        view.setSelected(true);
        if (this.f990b == view) {
            this.f995g = 1;
            this.f993e.setProgress((int) (this.f999k * 100.0f));
            m2368h(this.f1003o);
        } else if (this.f991c == view) {
            this.f995g = 2;
            this.f993e.setProgress((int) (this.f1000l * 100.0f));
            m2368h(this.f1004p);
        } else if (this.f992d == view) {
            this.f995g = 3;
            this.f993e.setProgress((int) (this.f1001m * 100.0f));
            m2368h(this.f1005q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2366f(this);
        m2370j();
    }

    public void setBeautyBigEye(boolean z) {
        this.f1004p = z;
        if (this.f995g == 2) {
            m2368h(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f1005q = z;
        if (this.f995g == 3) {
            m2368h(z);
        }
    }

    public void setFilterListener(zji zjiVar) {
        this.f994f = zjiVar;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f1002n = d30Var;
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuView(Context context) {
        this(context, null);
    }
}
