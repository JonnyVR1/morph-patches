package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.kpd0;
import p006l.C1307tg;
import p006l.InterfaceC1316to;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f724a;

    /* JADX INFO: renamed from: b */
    public AccountBeautyMenuItemView f725b;

    /* JADX INFO: renamed from: c */
    public AccountBeautyMenuItemView f726c;

    /* JADX INFO: renamed from: d */
    public AccountBeautyMenuItemView f727d;

    /* JADX INFO: renamed from: e */
    public AccountBeautyValueTipSeekBar f728e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1316to f729f;

    /* JADX INFO: renamed from: g */
    public int f730g;

    /* JADX INFO: renamed from: h */
    public kpd0 f731h;

    /* JADX INFO: renamed from: i */
    public kpd0 f732i;

    /* JADX INFO: renamed from: j */
    public kpd0 f733j;

    /* JADX INFO: renamed from: k */
    public float f734k;

    /* JADX INFO: renamed from: l */
    public float f735l;

    /* JADX INFO: renamed from: m */
    public float f736m;

    /* JADX INFO: renamed from: n */
    public d30 f737n;

    /* JADX INFO: renamed from: o */
    public boolean f738o;

    /* JADX INFO: renamed from: p */
    public boolean f739p;

    /* JADX INFO: renamed from: q */
    public boolean f740q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountBeautyMenuView$a */
    public class C0082a implements SeekBar.OnSeekBarChangeListener {
        public C0082a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = AccountBeautyMenuView.this.f730g;
            if (i2 == 1) {
                AccountBeautyMenuView.this.f734k = i / 100.0f;
            } else if (i2 == 2) {
                AccountBeautyMenuView.this.f735l = i / 100.0f;
            } else if (i2 == 3) {
                AccountBeautyMenuView.this.f736m = i / 100.0f;
            }
            if (NullChecker.a(AccountBeautyMenuView.this.f729f)) {
                AccountBeautyMenuView.this.f729f.mo24754n(i / 100.0f, AccountBeautyMenuView.this.f730g);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public AccountBeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f731h = new kpd0("account_beauty_white_skin", 0.5d);
        this.f732i = new kpd0("account_beauty_big_eye", 0.30000001192092896d);
        this.f733j = new kpd0("account_beauty_thin_face", 0.375d);
        this.f738o = true;
        this.f739p = true;
        this.f740q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m817f(View view) {
        C1307tg.m24677a(this, view);
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
    /* JADX INFO: renamed from: g */
    public final void m818g(boolean z) {
        this.f728e.setEnabled(z);
    }

    /* JADX INFO: renamed from: h */
    public final void m819h() {
        this.f725b.setSelected(false);
        this.f726c.setSelected(false);
        this.f727d.setSelected(false);
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
    /* JADX INFO: renamed from: i */
    public final void m820i() {
        this.f734k = ((Double) this.f731h.get()).floatValue();
        this.f735l = ((Double) this.f732i.get()).floatValue();
        this.f736m = ((Double) this.f733j.get()).floatValue();
        this.f725b.setText("美白");
        this.f725b.setOnClickListener(this);
        this.f725b.setSelected(true);
        this.f730g = 1;
        this.f726c.setText("大眼");
        this.f726c.setOnClickListener(this);
        this.f727d.setText("瘦脸");
        this.f727d.setOnClickListener(this);
        this.f728e.setMax(100);
        this.f728e.setProgress((int) (this.f734k * 100.0f));
        if (NullChecker.a(this.f729f)) {
            this.f729f.mo24754n(this.f736m, this.f730g);
            this.f729f.mo24754n(this.f734k, this.f730g);
            this.f729f.mo24754n(this.f735l, this.f730g);
        }
        this.f728e.setOnSeekBarChangeListener(new C0082a());
        this.f724a.setOnClickListener(new View.OnClickListener() { // from class: l.sg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21291a.m821j(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m821j(View view) {
        this.f731h.put(Double.valueOf(this.f734k));
        this.f732i.put(Double.valueOf(this.f735l));
        this.f733j.put(Double.valueOf(this.f736m));
        if (NullChecker.a(this.f737n)) {
            this.f737n.call();
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
        m819h();
        view.setSelected(true);
        if (this.f725b == view) {
            this.f730g = 1;
            this.f728e.setProgress((int) (this.f734k * 100.0f));
            m818g(this.f738o);
        } else if (this.f726c == view) {
            this.f730g = 2;
            this.f728e.setProgress((int) (this.f735l * 100.0f));
            m818g(this.f739p);
        } else if (this.f727d == view) {
            this.f730g = 3;
            this.f728e.setProgress((int) (this.f736m * 100.0f));
            m818g(this.f740q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m817f(this);
        m820i();
    }

    public void setBeautyBigEye(boolean z) {
        this.f739p = z;
        if (this.f730g == 2) {
            m818g(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f740q = z;
        if (this.f730g == 3) {
            m818g(z);
        }
    }

    public void setFilterListener(InterfaceC1316to interfaceC1316to) {
        this.f729f = interfaceC1316to;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f737n = d30Var;
    }

    public AccountBeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuView(Context context) {
        this(context, null);
    }
}
