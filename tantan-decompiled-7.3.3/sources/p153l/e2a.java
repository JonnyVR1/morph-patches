package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMyCustomMemeAct;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class e2a implements iam<v1a> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f91710a;

    /* JADX INFO: renamed from: b */
    public VImage f91711b;

    /* JADX INFO: renamed from: c */
    public VText f91712c;

    /* JADX INFO: renamed from: d */
    public VText f91713d;

    /* JADX INFO: renamed from: e */
    public VText f91714e;

    /* JADX INFO: renamed from: f */
    public GridView f91715f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f91716g;

    /* JADX INFO: renamed from: h */
    public VText f91717h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f91718i;

    /* JADX INFO: renamed from: j */
    public VText f91719j;

    /* JADX INFO: renamed from: k */
    public VText f91720k;

    /* JADX INFO: renamed from: l */
    public v1a f91721l;

    /* JADX INFO: renamed from: m */
    public CoreMyCustomMemeAct f91722m;

    /* JADX INFO: renamed from: n */
    public C16688a f91723n = new C16688a();

    /* JADX INFO: renamed from: l.e2a$a */
    public class C16688a extends dq1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f91724c;

        /* JADX INFO: renamed from: d */
        public boolean f91725d;

        public C16688a() {
            StickerPackage stickerPackageNew_ = StickerPackage.new_();
            this.f91724c = stickerPackageNew_;
            stickerPackageNew_.stickers = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m119073A(Sticker sticker, View view) {
            tcz.m190523A(e2a.this.f91722m, sticker);
        }

        /* JADX INFO: renamed from: B */
        public void m119074B(StickerPackage stickerPackage) {
            this.f91724c = stickerPackage;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: C */
        public void m119075C(boolean z) {
            this.f91725d = z;
            e2a.this.f91722m.setSwipeBackEnable(!z);
            if (z) {
                return;
            }
            e2a.this.f91720k.setText(R$string.f21737i6);
        }

        /* JADX INFO: renamed from: D */
        public Picture.ImageUri m119076D(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f91724c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f91724c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157115s1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y0);
            }
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, String str, int i, int i2) {
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(edc0.f93179C1);
            final VCheckBox vCheckBox = (VCheckBox) frameLayout.findViewById(edc0.f93278S3);
            VText vText = (VText) frameLayout.findViewById(edc0.f93404l4);
            final Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(str);
            final VText vText2 = (VText) frameLayout.findViewById(edc0.f93228K1);
            if (!NullChecker.m82486a(stickerM35930s3) || stickerM35930s3.pictures.isEmpty()) {
                uqb0.f180374G.m98798o(vDraweeView);
                return;
            }
            frameLayout.setTag(stickerM35930s3);
            if (TEnum.equals(stickerM35930s3.source, "shanmeng")) {
                uqb0.f180374G.m127115L0(vDraweeView, stickerM35930s3.pictures.get(0).url);
            } else {
                uqb0.f180374G.m127096B0(vDraweeView, m119076D(stickerM35930s3.pictures.get(0)));
            }
            if (this.f91725d) {
                bnl0.m105524M(vCheckBox, true);
                vCheckBox.setClickable(false);
                int iM198986n0 = e2a.this.f91721l.m198986n0(stickerM35930s3.f56859id);
                if (iM198986n0 != -1) {
                    vCheckBox.setChecked(true);
                    bnl0.m105524M(vText2, true);
                    vText2.setText((iM198986n0 + 1) + "");
                } else {
                    vCheckBox.setChecked(false);
                    bnl0.m105524M(vText2, false);
                }
                bnl0.m105509E0(frameLayout, new View.OnClickListener() { // from class: l.c2a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f79456a.m119079z(vCheckBox, stickerM35930s3, vText2, view2);
                    }
                });
            } else {
                vCheckBox.setChecked(false);
                bnl0.m105524M(vCheckBox, false);
                bnl0.m105524M(vText2, false);
                bnl0.m105509E0(frameLayout, new View.OnClickListener() { // from class: l.d2a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f84761a.m119073A(stickerM35930s3, view2);
                    }
                });
            }
            if ("pending".equals(stickerM35930s3.status)) {
                bnl0.m105524M(vText, true);
                vText.setText(R$string.f21764l6);
            } else if (!ChatGroupStatus.banned.equals(stickerM35930s3.status)) {
                bnl0.m105524M(vText, false);
            } else {
                bnl0.m105524M(vText, true);
                vText.setText(R$string.f21800p6);
            }
        }

        /* JADX INFO: renamed from: y */
        public boolean m119078y() {
            return this.f91725d;
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m119079z(VCheckBox vCheckBox, Sticker sticker, VText vText, View view) {
            if (vCheckBox.isChecked()) {
                vCheckBox.setChecked(false);
                e2a.this.f91721l.m198995z0(sticker.f56859id);
                int iM198985m0 = e2a.this.f91721l.m198985m0();
                e2a e2aVar = e2a.this;
                if (iM198985m0 > 0) {
                    e2aVar.f91720k.setText(e2a.this.f91722m.getString(R$string.f21737i6) + "(" + e2a.this.f91721l.m198985m0() + ")");
                } else {
                    e2aVar.f91720k.setText(R$string.f21737i6);
                }
                notifyDataSetChanged();
                return;
            }
            if (e2a.this.f91721l.m198988p0()) {
                o1j0.m165649w(R$string.f21791o6);
                return;
            }
            vCheckBox.setChecked(true);
            int iM198983k0 = e2a.this.f91721l.m198983k0(sticker.f56859id);
            bnl0.m105524M(vText, true);
            vText.setText(iM198983k0 + "");
            e2a.this.f91720k.setText(e2a.this.f91722m.getString(R$string.f21737i6) + "(" + e2a.this.f91721l.m198985m0() + ")");
        }
    }

    public e2a(CoreMyCustomMemeAct coreMyCustomMemeAct) {
        this.f91722m = coreMyCustomMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m119057p(View view) {
        if (this.f91723n.f91724c.stickers.size() >= 300) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            tcz.m190532J(this.f91722m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m119058q(View view) {
        i4g0.m138523u("e_stickers_delete", this.f91722m.pageId(), jyb.m147494Y("stickers_id_new", Arrays.toString(this.f91721l.m198987o0())));
        this.f91721l.m198984l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m119059s(View view) {
        i4g0.m138523u("e_stickers_move_to_front", this.f91722m.pageId(), jyb.m147494Y("stickers_id_new", Arrays.toString(this.f91721l.m198987o0())));
        this.f91721l.m198994y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m119060u(View view) {
        m119066n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m119061v(View view) {
        m119065m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m119062w(View view) {
        this.f91722m.onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f91722m;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119063k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m119063k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2a.m123606b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v1a v1aVar) {
        this.f91721l = v1aVar;
    }

    /* JADX INFO: renamed from: m */
    public void m119065m() {
        bnl0.m105524M(this.f91713d, true);
        bnl0.m105524M(this.f91714e, false);
        bnl0.m105524M(this.f91716g, true);
        bnl0.m105524M(this.f91718i, false);
        this.f91723n.m119075C(false);
        this.f91721l.f181940a.clear();
        this.f91723n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public void m119066n() {
        bnl0.m105524M(this.f91713d, false);
        bnl0.m105524M(this.f91714e, true);
        bnl0.m105524M(this.f91716g, false);
        bnl0.m105524M(this.f91718i, true);
        this.f91723n.m119075C(true);
        this.f91723n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m119067o() {
        if (!this.f91723n.m119078y()) {
            return false;
        }
        m119065m();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m119068r() {
        this.f91715f.setNumColumns(4);
        this.f91715f.setAdapter((ListAdapter) this.f91723n);
        VText vText = this.f91712c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f91714e.setTypeface(typeface);
        this.f91713d.setTypeface(typeface);
        this.f91719j.setTypeface(typeface);
        this.f91720k.setTypeface(typeface);
        this.f91717h.setTypeface(typeface);
        bnl0.m105509E0(this.f91717h, new View.OnClickListener() { // from class: l.w1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186776a.m119057p(view);
            }
        });
        bnl0.m105522L(this.f91720k, new View.OnClickListener() { // from class: l.x1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192031a.m119058q(view);
            }
        });
        bnl0.m105522L(this.f91719j, new View.OnClickListener() { // from class: l.y1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197085a.m119059s(view);
            }
        });
        bnl0.m105509E0(this.f91713d, new View.OnClickListener() { // from class: l.z1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202493a.m119060u(view);
            }
        });
        bnl0.m105509E0(this.f91714e, new View.OnClickListener() { // from class: l.a2a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67945a.m119061v(view);
            }
        });
        bnl0.m105509E0(this.f91711b, new View.OnClickListener() { // from class: l.b2a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74593a.m119062w(view);
            }
        });
        if (this.f91723n.f91724c == null || jyb.m147479J(this.f91723n.f91724c.stickers)) {
            bnl0.m105524M(this.f91713d, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m119069x(StickerPackage stickerPackage) {
        this.f91723n.m119074B(stickerPackage);
        bnl0.m105524M(this.f91714e, false);
        boolean zM147479J = jyb.m147479J(stickerPackage.stickers);
        VText vText = this.f91712c;
        if (zM147479J) {
            vText.setText(this.f91722m.getString(R$string.f21782n6));
            bnl0.m105524M(this.f91713d, false);
            return;
        }
        vText.setText(this.f91722m.getString(R$string.f21782n6) + "(" + stickerPackage.stickers.size() + ")");
        bnl0.m105524M(this.f91713d, true);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
