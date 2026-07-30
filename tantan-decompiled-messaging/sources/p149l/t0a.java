package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMyCustomMemeAct;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class t0a implements s7m<k0a> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f167119a;

    /* JADX INFO: renamed from: b */
    public VImage f167120b;

    /* JADX INFO: renamed from: c */
    public VText f167121c;

    /* JADX INFO: renamed from: d */
    public VText f167122d;

    /* JADX INFO: renamed from: e */
    public VText f167123e;

    /* JADX INFO: renamed from: f */
    public GridView f167124f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f167125g;

    /* JADX INFO: renamed from: h */
    public VText f167126h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f167127i;

    /* JADX INFO: renamed from: j */
    public VText f167128j;

    /* JADX INFO: renamed from: k */
    public VText f167129k;

    /* JADX INFO: renamed from: l */
    public k0a f167130l;

    /* JADX INFO: renamed from: m */
    public CoreMyCustomMemeAct f167131m;

    /* JADX INFO: renamed from: n */
    public C20090a f167132n = new C20090a();

    /* JADX INFO: renamed from: l.t0a$a */
    public class C20090a extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f167133c;

        /* JADX INFO: renamed from: d */
        public boolean f167134d;

        public C20090a() {
            StickerPackage stickerPackageNew_ = StickerPackage.new_();
            this.f167133c = stickerPackageNew_;
            stickerPackageNew_.stickers = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m186848A(Sticker sticker, View view) {
            w3z.m201395A(t0a.this.f167131m, sticker);
        }

        /* JADX INFO: renamed from: B */
        public void m186849B(StickerPackage stickerPackage) {
            this.f167133c = stickerPackage;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: C */
        public void m186850C(boolean z) {
            this.f167134d = z;
            t0a.this.f167131m.setSwipeBackEnable(!z);
            if (z) {
                return;
            }
            t0a.this.f167129k.setText(R$string.f20995i6);
        }

        /* JADX INFO: renamed from: D */
        public Picture.ImageUri m186851D(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f167133c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f167133c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126559s1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y0);
            }
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, String str, int i, int i2) {
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.f195944C1);
            final VCheckBox vCheckBox = (VCheckBox) frameLayout.findViewById(y4c0.f196043S3);
            VText vText = (VText) frameLayout.findViewById(y4c0.f196169l4);
            final Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(str);
            final VText vText2 = (VText) frameLayout.findViewById(y4c0.f195993K1);
            if (!NullChecker.m81303a(stickerM34927s3) || stickerM34927s3.pictures.isEmpty()) {
                qib0.f154691G.m184725o(vDraweeView);
                return;
            }
            frameLayout.setTag(stickerM34927s3);
            if (TEnum.equals(stickerM34927s3.source, "shanmeng")) {
                qib0.f154691G.m102331L0(vDraweeView, stickerM34927s3.pictures.get(0).url);
            } else {
                qib0.f154691G.m102312B0(vDraweeView, m186851D(stickerM34927s3.pictures.get(0)));
            }
            if (this.f167134d) {
                xdl0.m208344M(vCheckBox, true);
                vCheckBox.setClickable(false);
                int iM144004n0 = t0a.this.f167130l.m144004n0(stickerM34927s3.f56011id);
                if (iM144004n0 != -1) {
                    vCheckBox.setChecked(true);
                    xdl0.m208344M(vText2, true);
                    vText2.setText((iM144004n0 + 1) + "");
                } else {
                    vCheckBox.setChecked(false);
                    xdl0.m208344M(vText2, false);
                }
                xdl0.m208329E0(frameLayout, new View.OnClickListener() { // from class: l.r0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f157154a.m186854z(vCheckBox, stickerM34927s3, vText2, view2);
                    }
                });
            } else {
                vCheckBox.setChecked(false);
                xdl0.m208344M(vCheckBox, false);
                xdl0.m208344M(vText2, false);
                xdl0.m208329E0(frameLayout, new View.OnClickListener() { // from class: l.s0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f161760a.m186848A(stickerM34927s3, view2);
                    }
                });
            }
            if ("pending".equals(stickerM34927s3.status)) {
                xdl0.m208344M(vText, true);
                vText.setText(R$string.f21022l6);
            } else if (!ChatGroupStatus.banned.equals(stickerM34927s3.status)) {
                xdl0.m208344M(vText, false);
            } else {
                xdl0.m208344M(vText, true);
                vText.setText(R$string.f21058p6);
            }
        }

        /* JADX INFO: renamed from: y */
        public boolean m186853y() {
            return this.f167134d;
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m186854z(VCheckBox vCheckBox, Sticker sticker, VText vText, View view) {
            if (vCheckBox.isChecked()) {
                vCheckBox.setChecked(false);
                t0a.this.f167130l.m144013z0(sticker.f56011id);
                int iM144003m0 = t0a.this.f167130l.m144003m0();
                t0a t0aVar = t0a.this;
                if (iM144003m0 > 0) {
                    t0aVar.f167129k.setText(t0a.this.f167131m.getString(R$string.f20995i6) + "(" + t0a.this.f167130l.m144003m0() + ")");
                } else {
                    t0aVar.f167129k.setText(R$string.f20995i6);
                }
                notifyDataSetChanged();
                return;
            }
            if (t0a.this.f167130l.m144006p0()) {
                lsi0.m151593w(R$string.f21049o6);
                return;
            }
            vCheckBox.setChecked(true);
            int iM144001k0 = t0a.this.f167130l.m144001k0(sticker.f56011id);
            xdl0.m208344M(vText, true);
            vText.setText(iM144001k0 + "");
            t0a.this.f167129k.setText(t0a.this.f167131m.getString(R$string.f20995i6) + "(" + t0a.this.f167130l.m144003m0() + ")");
        }
    }

    public t0a(CoreMyCustomMemeAct coreMyCustomMemeAct) {
        this.f167131m = coreMyCustomMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m186832p(View view) {
        if (this.f167132n.f167133c.stickers.size() >= 300) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            w3z.m201404J(this.f167131m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m186833q(View view) {
        zvf0.m220399u("e_stickers_delete", this.f167131m.pageId(), vwb.m200311Y("stickers_id_new", Arrays.toString(this.f167130l.m144005o0())));
        this.f167130l.m144002l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m186834s(View view) {
        zvf0.m220399u("e_stickers_move_to_front", this.f167131m.pageId(), vwb.m200311Y("stickers_id_new", Arrays.toString(this.f167130l.m144005o0())));
        this.f167130l.m144012y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m186835u(View view) {
        m186841n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m186836v(View view) {
        m186840m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m186837w(View view) {
        this.f167131m.onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f167131m;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186838k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m186838k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u0a.m191313b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k0a k0aVar) {
        this.f167130l = k0aVar;
    }

    /* JADX INFO: renamed from: m */
    public void m186840m() {
        xdl0.m208344M(this.f167122d, true);
        xdl0.m208344M(this.f167123e, false);
        xdl0.m208344M(this.f167125g, true);
        xdl0.m208344M(this.f167127i, false);
        this.f167132n.m186850C(false);
        this.f167130l.f120463a.clear();
        this.f167132n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public void m186841n() {
        xdl0.m208344M(this.f167122d, false);
        xdl0.m208344M(this.f167123e, true);
        xdl0.m208344M(this.f167125g, false);
        xdl0.m208344M(this.f167127i, true);
        this.f167132n.m186850C(true);
        this.f167132n.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m186842o() {
        if (!this.f167132n.m186853y()) {
            return false;
        }
        m186840m();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m186843r() {
        this.f167124f.setNumColumns(4);
        this.f167124f.setAdapter((ListAdapter) this.f167132n);
        VText vText = this.f167121c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f167123e.setTypeface(typeface);
        this.f167122d.setTypeface(typeface);
        this.f167128j.setTypeface(typeface);
        this.f167129k.setTypeface(typeface);
        this.f167126h.setTypeface(typeface);
        xdl0.m208329E0(this.f167126h, new View.OnClickListener() { // from class: l.l0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125481a.m186832p(view);
            }
        });
        xdl0.m208342L(this.f167129k, new View.OnClickListener() { // from class: l.m0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130722a.m186833q(view);
            }
        });
        xdl0.m208342L(this.f167128j, new View.OnClickListener() { // from class: l.n0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136486a.m186834s(view);
            }
        });
        xdl0.m208329E0(this.f167122d, new View.OnClickListener() { // from class: l.o0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141306a.m186835u(view);
            }
        });
        xdl0.m208329E0(this.f167123e, new View.OnClickListener() { // from class: l.p0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146573a.m186836v(view);
            }
        });
        xdl0.m208329E0(this.f167120b, new View.OnClickListener() { // from class: l.q0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152020a.m186837w(view);
            }
        });
        if (this.f167132n.f167133c == null || vwb.m200296J(this.f167132n.f167133c.stickers)) {
            xdl0.m208344M(this.f167122d, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m186844x(StickerPackage stickerPackage) {
        this.f167132n.m186849B(stickerPackage);
        xdl0.m208344M(this.f167123e, false);
        boolean zM200296J = vwb.m200296J(stickerPackage.stickers);
        VText vText = this.f167121c;
        if (zM200296J) {
            vText.setText(this.f167131m.getString(R$string.f21040n6));
            xdl0.m208344M(this.f167122d, false);
            return;
        }
        vText.setText(this.f167131m.getString(R$string.f21040n6) + "(" + stickerPackage.stickers.size() + ")");
        xdl0.m208344M(this.f167122d, true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
