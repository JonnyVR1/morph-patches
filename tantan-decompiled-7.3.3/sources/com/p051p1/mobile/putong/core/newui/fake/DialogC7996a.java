package com.p051p1.mobile.putong.core.newui.fake;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jl80;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.q8g0;
import p153l.w1e;
import p153l.yyf;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a */
/* JADX INFO: loaded from: classes11.dex */
public class DialogC7996a extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f22179a;

    /* JADX INFO: renamed from: b */
    public ImageView f22180b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f22181c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f22182d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f22183e;

    /* JADX INFO: renamed from: f */
    public VText f22184f;

    /* JADX INFO: renamed from: g */
    public TextView f22185g;

    /* JADX INFO: renamed from: h */
    public l4g0 f22186h;

    /* JADX INFO: renamed from: i */
    public Act f22187i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a$a */
    public class a extends AnimListener {
        public a() {
        }

        @Override // com.tantan.library.svga.AnimListener
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

            @Override // com.tantan.library.svga.AnimListener
            public void onStart() {
                super.onStart();
                bnl0.m105525M0(DialogC7996a.this.f22182d, false);
            }
        }

        public b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGALoader.with(DialogC7996a.this.f22187i).repeatCount(-1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").animListener(new a()).into(DialogC7996a.this.f22183e);
        }
    }

    public DialogC7996a(@NonNull Context context) {
        super(context);
        m37405v(context);
    }

    /* JADX INFO: renamed from: v */
    private void m37405v(Context context) {
        this.f22187i = (Act) context;
        setContentView(m37408u(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m37406w(View view) {
        dismiss();
        i4g0.m138523u("e_fake_togood_upload_button", "p_fake_togood_upload", jyb.m147494Y("button_type_fake", "close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m37407y(View view) {
        i4g0.m138523u("e_fake_togood_upload_button", "p_fake_togood_upload", jyb.m147494Y("button_type_fake", "open"));
        C7997b.m37423r().m37427D(this.f22187i, MediaPickerAct.m48968h2(this.f22187i, 1, false, false, true, "fakeView", MediaPickerAct.f31471D, false, true, CoreModule.m30930K().me_().gender), new FakeHoldFragment.InterfaceC7995a() { // from class: l.xyf
            @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
            /* JADX INFO: renamed from: a */
            public final void mo37400a(ArrayList arrayList, String str) {
                this.f196744a.m37409x(arrayList, str);
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        w1e.m204401e(this.f22186h);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        this.f22184f.setText(q8g0.m175796b0("上传真实头像，\n获得最高10倍曝光！", jyb.m147507f0(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), Color.parseColor("#FE7E1D"), lyh0.m156283c(2)));
        l4g0 l4g0VarM204399c = w1e.m204399c("p_fake_togood_upload", jl80.class.getName());
        this.f22186h = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        bnl0.m105525M0(this.f22181c, true);
        SVGALoader.with(this.f22187i).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").downloadOnly();
        SVGALoader.with(this.f22187i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/b1d2a9e0-ce15-47b3-a0da-b25dafbb830514.pdf").animListener(new a()).into(this.f22181c);
        SVGALoader.with(this.f22187i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/72878acd-75ab-4f88-857d-eaaa2ce9a48714.pdf").animListener(new b()).into(this.f22182d);
        this.f22180b.setOnClickListener(new View.OnClickListener() { // from class: l.vyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186370a.m37406w(view);
            }
        });
        this.f22185g.setOnClickListener(new View.OnClickListener() { // from class: l.wyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191637a.m37407y(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m37408u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yyf.m217970b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m37409x(ArrayList arrayList, String str) {
        if (isShowing()) {
            dismiss();
        }
    }
}
