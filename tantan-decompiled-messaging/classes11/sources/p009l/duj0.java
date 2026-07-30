package p009l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadGuideImageView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.f6c0;
import l.j760;
import l.l5j0;
import l.u4c0;
import l.v7c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class duj0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public final Context f12002f;

    /* JADX INFO: renamed from: g */
    public final int f12003g;

    /* JADX INFO: renamed from: h */
    public d30 f12004h;

    /* JADX INFO: renamed from: i */
    public cwf0 f12005i;

    public duj0(@NonNull Context context, int i) {
        super(context, v7c0.c);
        this.f12002f = context;
        this.f12003g = i;
        cwf0 cwf0VarM16062c = i0e.m16062c(m13485E(), duj0.class.getSimpleName());
        this.f12005i = cwf0VarM16062c;
        cwf0VarM16062c.p(new j760[]{vwb.Y("photo_sample_type", m13490G(i))});
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: A */
    private void m13482A() {
        User userMe_;
        VText vTextFindViewById = findViewById(u4c0.ge);
        VText vTextFindViewById2 = findViewById(u4c0.Wc);
        UploadGuideImageView uploadGuideImageView = (UploadGuideImageView) findViewById(u4c0.y9);
        UploadGuideImageView uploadGuideImageView2 = (UploadGuideImageView) findViewById(u4c0.z9);
        UploadGuideImageView uploadGuideImageView3 = (UploadGuideImageView) findViewById(u4c0.A9);
        UploadGuideImageView uploadGuideImageView4 = (UploadGuideImageView) findViewById(u4c0.X9);
        UploadGuideImageView uploadGuideImageView5 = (UploadGuideImageView) findViewById(u4c0.H3);
        UploadGuideImageView uploadGuideImageView6 = (UploadGuideImageView) findViewById(u4c0.I3);
        UploadGuideImageView uploadGuideImageView7 = (UploadGuideImageView) findViewById(u4c0.J3);
        UploadGuideImageView uploadGuideImageView8 = (UploadGuideImageView) findViewById(u4c0.K3);
        TextView textView = (TextView) findViewById(u4c0.M1);
        if (vTextFindViewById == null || vTextFindViewById2 == null || uploadGuideImageView == null || uploadGuideImageView2 == null || uploadGuideImageView3 == null || uploadGuideImageView4 == null || uploadGuideImageView5 == null || uploadGuideImageView6 == null || uploadGuideImageView7 == null || uploadGuideImageView8 == null || textView == null || (userMe_ = CoreModule.K().me_()) == null) {
            return;
        }
        boolean zIsFemale = userMe_.isFemale();
        String str = "全身照";
        if (this.f12003g == 0) {
            uploadGuideImageView.m7758d(1, "正面照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjJMRkRXR0o2N0gzUks3REczS0JDTExUV0UzUkFEMjE0IiwidyI6MjgwLCJoIjozMjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzM5OTkxOTIwNjgyMDQ4OTMzfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNWRjNDU1JIRkJPUDVFQUJSNTNYSFE1QlNQWVRGTzE0IiwidyI6MjgwLCJoIjozMjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTk0MjI5Mzc1MjAwNzgyODU4fQ.png");
            uploadGuideImageView2.m7758d(1, "户外照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpFSUFEWFdPWjJLTEwyWVNaNk8zREhGRFVPVVRNNTE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NDcyMDAxODEwNzg2OTAwOTE2fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFLTFlQNUFSUEE2VU9YQlVMMllYR1FGRU5SWklJTDE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTIyMzM1NzE3OTQ2Mjk4ODQ4NX0.png");
            uploadGuideImageView3.m7758d(1, "全身照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWkUzSVRRVlE2VUtPSDJSTUpYV05WTDVXVFRIVzE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTc2NzI0MzE4NDEwNDA0MzU5Nn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFaM1pJMkI0QUxSMlVEMkZGS0FFNDdGU0JIMlNLVjE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ1NTk2MjM1OTY0NzA5MjI4fQ.png");
            xdl0.M(uploadGuideImageView4, false);
            uploadGuideImageView5.m7758d(3, "照片模糊", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQNklZRUFMUUVES0ZUTVAyVDZYVFlQRzM2RDVPSjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTQ2NjYwMzc3NjM5Mzk5NjMzMX0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJMUlhNNUhVV0NYTVlMTUtQUDZFN0M1RjJVWDNLSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2Nzg0NTUzNjk0Mjg3NDk4ODg4fQ.png");
            uploadGuideImageView6.m7758d(3, "网图", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEU0RJREJNQ1U1RURISUJEQTNINUpQNEpNRkI2QzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzIxMjk5MTEzNzUxMTExMTQ0fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikc2NElHWkNYM0RJVE9MM04yWkRXUVY0VlZCSDZRSzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTg2MzEyOTI5ODA1NzQ4NzM5N30.png");
            xdl0.M(uploadGuideImageView7, false);
            xdl0.M(uploadGuideImageView8, false);
        } else {
            xdl0.M(uploadGuideImageView, false);
            xdl0.M(uploadGuideImageView2, false);
            xdl0.M(uploadGuideImageView3, false);
            xdl0.M(uploadGuideImageView4, true);
            uploadGuideImageView4.setSizeType(2);
            vTextFindViewById2.setText("只有上传符合要求的照片，才可领取奖励");
            int i = this.f12003g;
            if (i == 2) {
                uploadGuideImageView4.m7758d(1, "全身照示例", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWkUzSVRRVlE2VUtPSDJSTUpYV05WTDVXVFRIVzE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTc2NzI0MzE4NDEwNDA0MzU5Nn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFaM1pJMkI0QUxSMlVEMkZGS0FFNDdGU0JIMlNLVjE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ1NTk2MjM1OTY0NzA5MjI4fQ.png");
            } else if (i == 1) {
                uploadGuideImageView4.m7758d(1, "户外照示例", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpFSUFEWFdPWjJLTEwyWVNaNk8zREhGRFVPVVRNNTE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NDcyMDAxODEwNzg2OTAwOTE2fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFLTFlQNUFSUEE2VU9YQlVMMllYR1FGRU5SWklJTDE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTIyMzM1NzE3OTQ2Mjk4ODQ4NX0.png");
                str = "户外照";
            } else {
                str = "";
            }
            String strConcat = "上传本人五官清晰的".concat(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), strConcat.indexOf(str), strConcat.length(), 33);
            vTextFindViewById.setText(spannableStringBuilder);
            uploadGuideImageView5.setSizeType(0);
            uploadGuideImageView6.setSizeType(0);
            uploadGuideImageView7.setSizeType(0);
            uploadGuideImageView8.setSizeType(0);
            uploadGuideImageView5.m7758d(3, "照片模糊", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQNklZRUFMUUVES0ZUTVAyVDZYVFlQRzM2RDVPSjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTQ2NjYwMzc3NjM5Mzk5NjMzMX0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJMUlhNNUhVV0NYTVlMTUtQUDZFN0M1RjJVWDNLSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2Nzg0NTUzNjk0Mjg3NDk4ODg4fQ.png");
            uploadGuideImageView6.m7758d(3, "遮挡五官", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVRUDZZNVJJR1FLT0wyT0NPR1ZaSTZWQzdNR01JRzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDQ1NDk3NDU0NjQxMDkwODI5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjVUWVZTQlpHMk9BT0lFQkZDT0VMUzVFTUtBRkRaRDE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3Mzk3NzcwMzMzMDgxNzM1OTkwfQ.png");
            uploadGuideImageView7.m7758d(3, "网图", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEU0RJREJNQ1U1RURISUJEQTNINUpQNEpNRkI2QzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzIxMjk5MTEzNzUxMTExMTQ0fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikc2NElHWkNYM0RJVE9MM04yWkRXUVY0VlZCSDZRSzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTg2MzEyOTI5ODA1NzQ4NzM5N30.png");
            uploadGuideImageView8.m7758d(3, "无人", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFPSTdQTEdTSkRSQkJUNFVVSlFQT05IUDRUUDNLWjE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODE2MzgxMjc2NjUxMDcxMDg3fQ.png");
        }
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.cuj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10778a.m13483C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m13483C(View view) {
        d30 d30Var = this.f12004h;
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.r("e_open_album", m13485E());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m13484D(DialogInterface dialogInterface) {
        i0e.m16064e(this.f12005i);
    }

    /* JADX INFO: renamed from: E */
    private String m13485E() {
        return "p_upload_photo_sample";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private void m13488z() {
        Window window = getWindow();
        if (NullChecker.a(window)) {
            getWindow().setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setState(3);
            frameLayout.setBackgroundResource(x2c0.u5);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0857a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m13489F(d30 d30Var) {
        this.f12004h = d30Var;
    }

    /* JADX INFO: renamed from: G */
    public final String m13490G(int i) {
        if (i == 0) {
            return "other_photo";
        }
        if (i != 1) {
            return i != 2 ? "" : "full_photo";
        }
        return "outdoor_photo";
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f12002f).inflate(f6c0.Jc, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m13488z();
        m13482A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        i0e.m16065f(this.f12005i);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.buj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10316a.m13484D(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.duj0$a */
    public class C0857a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f12006a;

        public C0857a(BottomSheetBehavior bottomSheetBehavior) {
            this.f12006a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f12006a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                duj0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
