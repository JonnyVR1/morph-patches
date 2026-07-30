package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.C2466R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p147v.AutoVDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class abw extends l5j0 {

    /* JADX INFO: renamed from: f */
    public cwf0 f68753f;

    public abw(@NonNull Context context) {
        super(context, v7c0.f180360g);
        this.f68753f = i0e.m133794c("p_explain_pop", Dialog.class.getName());
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        i0e.m133796e(this.f68753f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m95702y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public void m95703z(Act act, LoveLetterEntryInfo loveLetterEntryInfo) {
        i0e.m133797f(this.f68753f);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f96112z6, (ViewGroup) null);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(u4c0.f174369me);
        mep0.m154301c1(viewInflate, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        autoVDraweeView.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRSUDU0VEUyTFhVNVpXSExEMjdUTEFUQ0ZDUUxONjE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png", 1);
        ((AutoVDraweeView) viewInflate.findViewById(u4c0.f174007R1)).m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRDVVVBMkhLVkM0UVM2UVBZVzM3WkxWRlZNTEpSSzE0IiwidyI6NzcxLCJoIjo4NzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjE4NTI4MTcwMTQ0NDUyNjd9.png", 1);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173803F1), new View.OnClickListener() { // from class: l.zaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202405a.m95702y(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174002Qd);
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM124687a = new g7c("MM.dd", Locale.getDefault()).m124687a();
        String str = simpleDateFormatM124687a.format(date) + " - " + simpleDateFormatM124687a.format(date2);
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
        BottomSheetBehavior.from(findViewById(C2466R.id.design_bottom_sheet)).setState(3);
    }
}
