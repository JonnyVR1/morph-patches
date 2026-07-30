package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.C2489R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p151v.AutoVDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class ycw extends pej0 {

    /* JADX INFO: renamed from: f */
    public l4g0 f198549f;

    public ycw(@NonNull Context context) {
        super(context, agc0.f71121g);
        this.f198549f = w1e.m204399c("p_explain_pop", Dialog.class.getName());
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        w1e.m204401e(this.f198549f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m215181y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public void m215182z(Act act, LoveLetterEntryInfo loveLetterEntryInfo) {
        w1e.m204402f(this.f198549f);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125322A6, (ViewGroup) null);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(adc0.f70511pe);
        qnp0.m177260c1(viewInflate, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        autoVDraweeView.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRSUDU0VEUyTFhVNVpXSExEMjdUTEFUQ0ZDUUxONjE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png", 1);
        ((AutoVDraweeView) viewInflate.findViewById(adc0.f70095R1)).m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRDVVVBMkhLVkM0UVM2UVBZVzM3WkxWRlZNTEpSSzE0IiwidyI6NzcxLCJoIjo4NzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjE4NTI4MTcwMTQ0NDUyNjd9.png", 1);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f69891F1), new View.OnClickListener() { // from class: l.xcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193409a.m215181y(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70141Td);
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM157356a = new m8c("MM.dd", Locale.getDefault()).m157356a();
        String str = simpleDateFormatM157356a.format(date) + " - " + simpleDateFormatM157356a.format(date2);
        String str2 = "（  " + str + "  ）";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FE5F1D"));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableStringBuilder);
        setContentView(viewInflate);
        show();
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        BottomSheetBehavior.from(findViewById(C2489R.id.design_bottom_sheet)).setState(3);
    }
}
