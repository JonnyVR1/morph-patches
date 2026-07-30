package p003l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMyCustomMemeAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.o7r;
import l.qib0;
import l.s7m;
import l.t100;
import l.u0a;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VCheckBox;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class t0a implements s7m<k0a> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f7374a;

    /* JADX INFO: renamed from: b */
    public VImage f7375b;

    /* JADX INFO: renamed from: c */
    public VText f7376c;

    /* JADX INFO: renamed from: d */
    public VText f7377d;

    /* JADX INFO: renamed from: e */
    public VText f7378e;

    /* JADX INFO: renamed from: f */
    public GridView f7379f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7380g;

    /* JADX INFO: renamed from: h */
    public VText f7381h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f7382i;

    /* JADX INFO: renamed from: j */
    public VText f7383j;

    /* JADX INFO: renamed from: k */
    public VText f7384k;

    /* JADX INFO: renamed from: l */
    public k0a f7385l;

    /* JADX INFO: renamed from: m */
    public CoreMyCustomMemeAct f7386m;

    /* JADX INFO: renamed from: n */
    public C0543a f7387n = new C0543a();

    /* JADX INFO: renamed from: l.t0a$a */
    public class C0543a extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f7388c;

        /* JADX INFO: renamed from: d */
        public boolean f7389d;

        public C0543a() {
            StickerPackage stickerPackageNew_ = StickerPackage.new_();
            this.f7388c = stickerPackageNew_;
            stickerPackageNew_.stickers = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m7684A(Sticker sticker, View view) {
            w3z.m8429A(t0a.this.f7386m, sticker);
        }

        /* JADX INFO: renamed from: B */
        public void m7685B(StickerPackage stickerPackage) {
            this.f7388c = stickerPackage;
            notifyDataSetChanged();
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
        /* JADX INFO: renamed from: C */
        public void m7686C(boolean z) {
            this.f7389d = z;
            t0a.this.f7386m.setSwipeBackEnable(!z);
            if (z) {
                return;
            }
            t0a.this.f7384k.setText(R.string.i6);
        }

        /* JADX INFO: renamed from: D */
        public Picture.ImageUri m7687D(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f7388c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f7388c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.s1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iY0 = (xdl0.y0() - t100.d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY0);
            }
            layoutParams.width = iY0;
            layoutParams.height = iY0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, v.VText] */
        /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, android.widget.CompoundButton, v.VCheckBox] */
        @Override // p003l.wp1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, String str, int i, int i2) {
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.C1);
            final ?? r9 = (VCheckBox) frameLayout.findViewById(y4c0.S3);
            AppCompatTextView appCompatTextView = (VText) frameLayout.findViewById(y4c0.l4);
            final Sticker stickerS3 = CoreModule.c.Z.s3(str);
            final ?? r1 = (VText) frameLayout.findViewById(y4c0.K1);
            if (!NullChecker.a(stickerS3) || stickerS3.pictures.isEmpty()) {
                qib0.G.o(vDraweeView);
                return;
            }
            frameLayout.setTag(stickerS3);
            if (TEnum.equals(stickerS3.source, "shanmeng")) {
                qib0.G.L0(vDraweeView, ((Media) ((Picture) stickerS3.pictures.get(0))).url);
            } else {
                qib0.G.B0(vDraweeView, m7687D((Picture) stickerS3.pictures.get(0)));
            }
            if (this.f7389d) {
                xdl0.M((View) r9, true);
                r9.setClickable(false);
                int iM5483n0 = t0a.this.f7385l.m5483n0(((DbObject) stickerS3).id);
                if (iM5483n0 != -1) {
                    r9.setChecked(true);
                    xdl0.M((View) r1, true);
                    r1.setText((iM5483n0 + 1) + "");
                } else {
                    r9.setChecked(false);
                    xdl0.M((View) r1, false);
                }
                xdl0.E0(frameLayout, new View.OnClickListener() { // from class: l.r0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f6751a.m7690z(r9, stickerS3, r1, view2);
                    }
                });
            } else {
                r9.setChecked(false);
                xdl0.M((View) r9, false);
                xdl0.M((View) r1, false);
                xdl0.E0(frameLayout, new View.OnClickListener() { // from class: l.s0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f7121a.m7684A(stickerS3, view2);
                    }
                });
            }
            if ("pending".equals(stickerS3.status)) {
                xdl0.M(appCompatTextView, true);
                appCompatTextView.setText(R.string.l6);
            } else if (!"banned".equals(stickerS3.status)) {
                xdl0.M(appCompatTextView, false);
            } else {
                xdl0.M(appCompatTextView, true);
                appCompatTextView.setText(R.string.p6);
            }
        }

        /* JADX INFO: renamed from: y */
        public boolean m7689y() {
            return this.f7389d;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m7690z(VCheckBox vCheckBox, Sticker sticker, VText vText, View view) {
            if (vCheckBox.isChecked()) {
                vCheckBox.setChecked(false);
                t0a.this.f7385l.m5492z0(((DbObject) sticker).id);
                int iM5482m0 = t0a.this.f7385l.m5482m0();
                t0a t0aVar = t0a.this;
                if (iM5482m0 > 0) {
                    t0aVar.f7384k.setText(t0a.this.f7386m.getString(R.string.i6) + "(" + t0a.this.f7385l.m5482m0() + ")");
                } else {
                    t0aVar.f7384k.setText(R.string.i6);
                }
                notifyDataSetChanged();
                return;
            }
            if (t0a.this.f7385l.m5485p0()) {
                lsi0.w(R.string.o6);
                return;
            }
            vCheckBox.setChecked(true);
            int iM5480k0 = t0a.this.f7385l.m5480k0(((DbObject) sticker).id);
            xdl0.M(vText, true);
            vText.setText(iM5480k0 + "");
            t0a.this.f7384k.setText(t0a.this.f7386m.getString(R.string.i6) + "(" + t0a.this.f7385l.m5482m0() + ")");
        }
    }

    public t0a(CoreMyCustomMemeAct coreMyCustomMemeAct) {
        this.f7386m = coreMyCustomMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m7666p(View view) {
        if (this.f7387n.f7388c.stickers.size() >= 300) {
            lsi0.w(R.string.m6);
        } else {
            w3z.m8438J(this.f7386m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m7667q(View view) {
        zvf0.u("e_stickers_delete", this.f7386m.pageId(), new j760[]{vwb.Y("stickers_id_new", Arrays.toString(this.f7385l.m5484o0()))});
        this.f7385l.m5481l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7668s(View view) {
        zvf0.u("e_stickers_move_to_front", this.f7386m.pageId(), new j760[]{vwb.Y("stickers_id_new", Arrays.toString(this.f7385l.m5484o0()))});
        this.f7385l.m5491y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m7669u(View view) {
        m7677n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m7670v(View view) {
        m7676m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m7671w(View view) {
        this.f7386m.onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7672C0() {
        return this.f7386m;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7674k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m7674k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u0a.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m7673i1(k0a k0aVar) {
        this.f7385l = k0aVar;
    }

    /* JADX INFO: renamed from: m */
    public void m7676m() {
        xdl0.M(this.f7377d, true);
        xdl0.M(this.f7378e, false);
        xdl0.M(this.f7380g, true);
        xdl0.M(this.f7382i, false);
        this.f7387n.m7686C(false);
        this.f7385l.f4773a.clear();
        this.f7387n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public void m7677n() {
        xdl0.M(this.f7377d, false);
        xdl0.M(this.f7378e, true);
        xdl0.M(this.f7380g, false);
        xdl0.M(this.f7382i, true);
        this.f7387n.m7686C(true);
        this.f7387n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m7678o() {
        if (!this.f7387n.m7689y()) {
            return false;
        }
        m7676m();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m7679r() {
        this.f7379f.setNumColumns(4);
        this.f7379f.setAdapter((ListAdapter) this.f7387n);
        AppCompatTextView appCompatTextView = this.f7376c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        appCompatTextView.setTypeface(typeface);
        this.f7378e.setTypeface(typeface);
        this.f7377d.setTypeface(typeface);
        this.f7383j.setTypeface(typeface);
        this.f7384k.setTypeface(typeface);
        this.f7381h.setTypeface(typeface);
        xdl0.E0(this.f7381h, new View.OnClickListener() { // from class: l.l0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5146a.m7666p(view);
            }
        });
        xdl0.L(this.f7384k, new View.OnClickListener() { // from class: l.m0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5487a.m7667q(view);
            }
        });
        xdl0.L(this.f7383j, new View.OnClickListener() { // from class: l.n0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5819a.m7668s(view);
            }
        });
        xdl0.E0(this.f7377d, new View.OnClickListener() { // from class: l.o0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6008a.m7669u(view);
            }
        });
        xdl0.E0(this.f7378e, new View.OnClickListener() { // from class: l.p0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6296a.m7670v(view);
            }
        });
        xdl0.E0(this.f7375b, new View.OnClickListener() { // from class: l.q0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6565a.m7671w(view);
            }
        });
        if (this.f7387n.f7388c == null || vwb.J(this.f7387n.f7388c.stickers)) {
            xdl0.M(this.f7377d, false);
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
    /* JADX INFO: renamed from: x */
    public void m7680x(StickerPackage stickerPackage) {
        this.f7387n.m7685B(stickerPackage);
        xdl0.M(this.f7378e, false);
        boolean zJ = vwb.J(stickerPackage.stickers);
        AppCompatTextView appCompatTextView = this.f7376c;
        if (zJ) {
            appCompatTextView.setText(this.f7386m.getString(R.string.n6));
            xdl0.M(this.f7377d, false);
            return;
        }
        appCompatTextView.setText(this.f7386m.getString(R.string.n6) + "(" + stickerPackage.stickers.size() + ")");
        xdl0.M(this.f7377d, true);
    }

    public void destroy() {
    }
}
