package com.p000p1.mobile.putong.core.newui.fake;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.cwf0;
import l.dd80;
import l.eqh0;
import l.j760;
import l.kxf;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.i0e;
import p009l.i0g0;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0009a extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f215a;

    /* JADX INFO: renamed from: b */
    public ImageView f216b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f217c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f218d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f219e;

    /* JADX INFO: renamed from: f */
    public VText f220f;

    /* JADX INFO: renamed from: g */
    public TextView f221g;

    /* JADX INFO: renamed from: h */
    public cwf0 f222h;

    /* JADX INFO: renamed from: i */
    public Act f223i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a$a */
    public class a extends AnimListener {
        public a() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a$b */
    public class b extends AnimListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a$b$a */
        public class a extends AnimListener {
            public a() {
            }

            public void onStart() {
                super.onStart();
                xdl0.M0(C0009a.this.f218d, false);
            }
        }

        public b() {
        }

        public void onFinished() {
            super.onFinished();
            SVGALoader.with(C0009a.this.f223i).repeatCount(-1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").animListener(new a()).into(C0009a.this.f219e);
        }
    }

    public C0009a(@NonNull Context context) {
        super(context);
        m331v(context);
    }

    /* JADX INFO: renamed from: v */
    private void m331v(Context context) {
        this.f223i = (Act) context;
        setContentView(m334u(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m332w(View view) {
        dismiss();
        zvf0.u("e_fake_togood_upload_button", "p_fake_togood_upload", new j760[]{vwb.Y("button_type_fake", "close")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m333y(View view) {
        zvf0.u("e_fake_togood_upload_button", "p_fake_togood_upload", new j760[]{vwb.Y("button_type_fake", "open")});
        C0010b.m349r().m353D(this.f223i, MediaPickerAct.g2(this.f223i, 1, false, false, true, "fakeView", MediaPickerAct.D, false, true, CoreModule.K().me_().gender), new FakeHoldFragment.InterfaceC0008a() { // from class: l.jxf
            @Override // com.p000p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC0008a
            /* JADX INFO: renamed from: a */
            public final void mo326a(ArrayList arrayList, String str) {
                this.f15355a.m335x(arrayList, str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        i0e.m16064e(this.f222h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        Window window = getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.o2)).setBackgroundResource(x2c0.gp);
        }
        this.f220f.setText(i0g0.m16129b0("上传真实头像，\n获得最高10倍曝光！", vwb.f0(new String[]{"10"}), Color.parseColor("#FE7E1D"), eqh0.c(2)));
        cwf0 cwf0VarM16062c = i0e.m16062c("p_fake_togood_upload", dd80.class.getName());
        this.f222h = cwf0VarM16062c;
        i0e.m16065f(cwf0VarM16062c);
        xdl0.M0(this.f217c, true);
        SVGALoader.with(this.f223i).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").downloadOnly();
        SVGALoader.with(this.f223i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/b1d2a9e0-ce15-47b3-a0da-b25dafbb830514.pdf").animListener(new a()).into(this.f217c);
        SVGALoader.with(this.f223i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/72878acd-75ab-4f88-857d-eaaa2ce9a48714.pdf").animListener(new b()).into(this.f218d);
        this.f216b.setOnClickListener(new View.OnClickListener() { // from class: l.hxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14276a.m332w(view);
            }
        });
        this.f221g.setOnClickListener(new View.OnClickListener() { // from class: l.ixf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14850a.m333y(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m334u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kxf.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m335x(ArrayList arrayList, String str) {
        if (isShowing()) {
            dismiss();
        }
    }
}
