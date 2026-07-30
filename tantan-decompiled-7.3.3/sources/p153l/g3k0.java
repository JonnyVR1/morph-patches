package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadGuideImageView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class g3k0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public final Context f101994f;

    /* JADX INFO: renamed from: g */
    public final int f101995g;

    /* JADX INFO: renamed from: h */
    public x20 f101996h;

    /* JADX INFO: renamed from: i */
    public l4g0 f101997i;

    public g3k0(@NonNull Context context, int i) {
        super(context, agc0.f71117c);
        this.f101994f = context;
        this.f101995g = i;
        l4g0 l4g0VarM204399c = w1e.m204399c(m128746E(), g3k0.class.getSimpleName());
        this.f101997i = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("photo_sample_type", m128751G(i)));
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: A */
    private void m128743A() {
        User userMe_;
        VText vText = (VText) findViewById(adc0.f70409je);
        VText vText2 = (VText) findViewById(adc0.f70223Yc);
        UploadGuideImageView uploadGuideImageView = (UploadGuideImageView) findViewById(adc0.f69814A9);
        UploadGuideImageView uploadGuideImageView2 = (UploadGuideImageView) findViewById(adc0.f69831B9);
        UploadGuideImageView uploadGuideImageView3 = (UploadGuideImageView) findViewById(adc0.f69848C9);
        UploadGuideImageView uploadGuideImageView4 = (UploadGuideImageView) findViewById(adc0.f70236Z9);
        UploadGuideImageView uploadGuideImageView5 = (UploadGuideImageView) findViewById(adc0.f69961J3);
        UploadGuideImageView uploadGuideImageView6 = (UploadGuideImageView) findViewById(adc0.f69978K3);
        UploadGuideImageView uploadGuideImageView7 = (UploadGuideImageView) findViewById(adc0.f69995L3);
        UploadGuideImageView uploadGuideImageView8 = (UploadGuideImageView) findViewById(adc0.f70012M3);
        TextView textView = (TextView) findViewById(adc0.f70010M1);
        if (vText == null || vText2 == null || uploadGuideImageView == null || uploadGuideImageView2 == null || uploadGuideImageView3 == null || uploadGuideImageView4 == null || uploadGuideImageView5 == null || uploadGuideImageView6 == null || uploadGuideImageView7 == null || uploadGuideImageView8 == null || textView == null || (userMe_ = CoreModule.m30930K().me_()) == null) {
            return;
        }
        boolean zIsFemale = userMe_.isFemale();
        String str = "全身照";
        if (this.f101995g == 0) {
            uploadGuideImageView.m44698d(1, "正面照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjJMRkRXR0o2N0gzUks3REczS0JDTExUV0UzUkFEMjE0IiwidyI6MjgwLCJoIjozMjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzM5OTkxOTIwNjgyMDQ4OTMzfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNWRjNDU1JIRkJPUDVFQUJSNTNYSFE1QlNQWVRGTzE0IiwidyI6MjgwLCJoIjozMjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTk0MjI5Mzc1MjAwNzgyODU4fQ.png");
            uploadGuideImageView2.m44698d(1, "户外照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpFSUFEWFdPWjJLTEwyWVNaNk8zREhGRFVPVVRNNTE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NDcyMDAxODEwNzg2OTAwOTE2fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFLTFlQNUFSUEE2VU9YQlVMMllYR1FGRU5SWklJTDE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTIyMzM1NzE3OTQ2Mjk4ODQ4NX0.png");
            uploadGuideImageView3.m44698d(1, "全身照", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWkUzSVRRVlE2VUtPSDJSTUpYV05WTDVXVFRIVzE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTc2NzI0MzE4NDEwNDA0MzU5Nn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFaM1pJMkI0QUxSMlVEMkZGS0FFNDdGU0JIMlNLVjE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ1NTk2MjM1OTY0NzA5MjI4fQ.png");
            bnl0.m105524M(uploadGuideImageView4, false);
            uploadGuideImageView5.m44698d(3, "照片模糊", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQNklZRUFMUUVES0ZUTVAyVDZYVFlQRzM2RDVPSjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTQ2NjYwMzc3NjM5Mzk5NjMzMX0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJMUlhNNUhVV0NYTVlMTUtQUDZFN0M1RjJVWDNLSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2Nzg0NTUzNjk0Mjg3NDk4ODg4fQ.png");
            uploadGuideImageView6.m44698d(3, "网图", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEU0RJREJNQ1U1RURISUJEQTNINUpQNEpNRkI2QzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzIxMjk5MTEzNzUxMTExMTQ0fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikc2NElHWkNYM0RJVE9MM04yWkRXUVY0VlZCSDZRSzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTg2MzEyOTI5ODA1NzQ4NzM5N30.png");
            bnl0.m105524M(uploadGuideImageView7, false);
            bnl0.m105524M(uploadGuideImageView8, false);
        } else {
            bnl0.m105524M(uploadGuideImageView, false);
            bnl0.m105524M(uploadGuideImageView2, false);
            bnl0.m105524M(uploadGuideImageView3, false);
            bnl0.m105524M(uploadGuideImageView4, true);
            uploadGuideImageView4.setSizeType(2);
            vText2.setText("只有上传符合要求的照片，才可领取奖励");
            int i = this.f101995g;
            if (i == 2) {
                uploadGuideImageView4.m44698d(1, "全身照示例", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWkUzSVRRVlE2VUtPSDJSTUpYV05WTDVXVFRIVzE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTc2NzI0MzE4NDEwNDA0MzU5Nn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFaM1pJMkI0QUxSMlVEMkZGS0FFNDdGU0JIMlNLVjE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ1NTk2MjM1OTY0NzA5MjI4fQ.png");
            } else if (i == 1) {
                uploadGuideImageView4.m44698d(1, "户外照示例", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpFSUFEWFdPWjJLTEwyWVNaNk8zREhGRFVPVVRNNTE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NDcyMDAxODEwNzg2OTAwOTE2fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFLTFlQNUFSUEE2VU9YQlVMMllYR1FGRU5SWklJTDE0IiwidyI6NDIzLCJoIjo1MjIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTIyMzM1NzE3OTQ2Mjk4ODQ4NX0.png");
                str = "户外照";
            } else {
                str = "";
            }
            String strConcat = "上传本人五官清晰的".concat(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), strConcat.indexOf(str), strConcat.length(), 33);
            vText.setText(spannableStringBuilder);
            uploadGuideImageView5.setSizeType(0);
            uploadGuideImageView6.setSizeType(0);
            uploadGuideImageView7.setSizeType(0);
            uploadGuideImageView8.setSizeType(0);
            uploadGuideImageView5.m44698d(3, "照片模糊", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQNklZRUFMUUVES0ZUTVAyVDZYVFlQRzM2RDVPSjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTQ2NjYwMzc3NjM5Mzk5NjMzMX0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJMUlhNNUhVV0NYTVlMTUtQUDZFN0M1RjJVWDNLSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2Nzg0NTUzNjk0Mjg3NDk4ODg4fQ.png");
            uploadGuideImageView6.m44698d(3, "遮挡五官", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVRUDZZNVJJR1FLT0wyT0NPR1ZaSTZWQzdNR01JRzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDQ1NDk3NDU0NjQxMDkwODI5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjVUWVZTQlpHMk9BT0lFQkZDT0VMUzVFTUtBRkRaRDE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3Mzk3NzcwMzMzMDgxNzM1OTkwfQ.png");
            uploadGuideImageView7.m44698d(3, "网图", zIsFemale ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEU0RJREJNQ1U1RURISUJEQTNINUpQNEpNRkI2QzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzIxMjk5MTEzNzUxMTExMTQ0fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikc2NElHWkNYM0RJVE9MM04yWkRXUVY0VlZCSDZRSzE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTg2MzEyOTI5ODA1NzQ4NzM5N30.png");
            uploadGuideImageView8.m44698d(3, "无人", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFPSTdQTEdTSkRSQkJUNFVVSlFQT05IUDRUUDNLWjE0IiwidyI6MjM1LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODE2MzgxMjc2NjUxMDcxMDg3fQ.png");
        }
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.f3k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96997a.m128744C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m128744C(View view) {
        x20 x20Var = this.f101996h;
        if (x20Var != null) {
            x20Var.call();
        }
        i4g0.m138520r("e_open_album", m128746E());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m128745D(DialogInterface dialogInterface) {
        w1e.m204401e(this.f101997i);
    }

    /* JADX INFO: renamed from: E */
    private String m128746E() {
        return "p_upload_photo_sample";
    }

    /* JADX INFO: renamed from: z */
    private void m128749z() {
        Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            getWindow().setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setState(3);
            frameLayout.setBackgroundResource(dbc0.f87503v5);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17127a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m128750F(x20 x20Var) {
        this.f101996h = x20Var;
    }

    /* JADX INFO: renamed from: G */
    public final String m128751G(int i) {
        if (i == 0) {
            return "other_photo";
        }
        if (i != 1) {
            return i != 2 ? "" : "full_photo";
        }
        return "outdoor_photo";
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f101994f).inflate(kec0.f125589Qc, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m128749z();
        m128743A();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        w1e.m204402f(this.f101997i);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.e3k0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f91979a.m128745D(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.g3k0$a */
    public class C17127a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f101998a;

        public C17127a(BottomSheetBehavior bottomSheetBehavior) {
            this.f101998a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f101998a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                g3k0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
