package com.p046p1.mobile.putong.core.newui.fake;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import p147v.VText;
import p149l.cwf0;
import p149l.dd80;
import p149l.eqh0;
import p149l.i0e;
import p149l.i0g0;
import p149l.kxf;
import p149l.u4c0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.a */
/* JADX INFO: loaded from: classes11.dex */
public class DialogC7845a extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f21437a;

    /* JADX INFO: renamed from: b */
    public ImageView f21438b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f21439c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f21440d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f21441e;

    /* JADX INFO: renamed from: f */
    public VText f21442f;

    /* JADX INFO: renamed from: g */
    public TextView f21443g;

    /* JADX INFO: renamed from: h */
    public cwf0 f21444h;

    /* JADX INFO: renamed from: i */
    public Act f21445i;

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
                xdl0.m208345M0(DialogC7845a.this.f21440d, false);
            }
        }

        public b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGALoader.with(DialogC7845a.this.f21445i).repeatCount(-1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").animListener(new a()).into(DialogC7845a.this.f21441e);
        }
    }

    public DialogC7845a(@NonNull Context context) {
        super(context);
        m36402v(context);
    }

    /* JADX INFO: renamed from: v */
    private void m36402v(Context context) {
        this.f21445i = (Act) context;
        setContentView(m36405u(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m36403w(View view) {
        dismiss();
        zvf0.m220399u("e_fake_togood_upload_button", "p_fake_togood_upload", vwb.m200311Y("button_type_fake", "close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m36404y(View view) {
        zvf0.m220399u("e_fake_togood_upload_button", "p_fake_togood_upload", vwb.m200311Y("button_type_fake", "open"));
        C7846b.m36420r().m36424D(this.f21445i, MediaPickerAct.m47785g2(this.f21445i, 1, false, false, true, "fakeView", MediaPickerAct.f30623D, false, true, CoreModule.m29932K().me_().gender), new FakeHoldFragment.InterfaceC7844a() { // from class: l.jxf
            @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
            /* JADX INFO: renamed from: a */
            public final void mo36397a(ArrayList arrayList, String str) {
                this.f120221a.m36406x(arrayList, str);
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        i0e.m133796e(this.f21444h);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        this.f21442f.setText(i0g0.m133861b0("上传真实头像，\n获得最高10倍曝光！", vwb.m200324f0(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), Color.parseColor("#FE7E1D"), eqh0.m117752c(2)));
        cwf0 cwf0VarM133794c = i0e.m133794c("p_fake_togood_upload", dd80.class.getName());
        this.f21444h = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        xdl0.m208345M0(this.f21439c, true);
        SVGALoader.with(this.f21445i).from("https://auto.tancdn.com/v1/raw/69ed17b0-409a-4fe3-a99a-059ff307359c14.pdf").downloadOnly();
        SVGALoader.with(this.f21445i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/b1d2a9e0-ce15-47b3-a0da-b25dafbb830514.pdf").animListener(new a()).into(this.f21439c);
        SVGALoader.with(this.f21445i).repeatCount(1).autoPlay(true).from("https://auto.tancdn.com/v1/raw/72878acd-75ab-4f88-857d-eaaa2ce9a48714.pdf").animListener(new b()).into(this.f21440d);
        this.f21438b.setOnClickListener(new View.OnClickListener() { // from class: l.hxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109865a.m36403w(view);
            }
        });
        this.f21443g.setOnClickListener(new View.OnClickListener() { // from class: l.ixf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115364a.m36404y(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m36405u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kxf.m147747b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m36406x(ArrayList arrayList, String str) {
        if (isShowing()) {
            dismiss();
        }
    }
}
