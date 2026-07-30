package p009l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l.cwf0;
import l.f6c0;
import l.l5j0;
import l.mep0;
import l.t100;
import l.u4c0;
import l.v7c0;
import l.xdl0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class abw extends l5j0 {

    /* JADX INFO: renamed from: f */
    public cwf0 f9375f;

    public abw(@NonNull Context context) {
        super(context, v7c0.g);
        this.f9375f = i0e.m16062c("p_explain_pop", Dialog.class.getName());
    }

    public void dismiss() {
        super.dismiss();
        i0e.m16064e(this.f9375f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11297y(View view) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m11298z(Act act, LoveLetterEntryInfo loveLetterEntryInfo) {
        i0e.m16065f(this.f9375f);
        View viewInflate = o7r.m19649a(act).inflate(f6c0.z6, (ViewGroup) null);
        AutoVDraweeView autoVDraweeViewFindViewById = viewInflate.findViewById(u4c0.me);
        mep0.c1(viewInflate, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
        autoVDraweeViewFindViewById.x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRSUDU0VEUyTFhVNVpXSExEMjdUTEFUQ0ZDUUxONjE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png", 1);
        viewInflate.findViewById(u4c0.R1).x("https://auto.tancdn.com/v1/images/eyJpZCI6IjRDVVVBMkhLVkM0UVM2UVBZVzM3WkxWRlZNTEpSSzE0IiwidyI6NzcxLCJoIjo4NzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjE4NTI4MTcwMTQ0NDUyNjd9.png", 1);
        xdl0.E0(viewInflate.findViewById(u4c0.F1), new View.OnClickListener() { // from class: l.zaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23540a.m11297y(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(u4c0.Qd);
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM14796a = new g7c("MM.dd", Locale.getDefault()).m14796a();
        String str = simpleDateFormatM14796a.format(date) + " - " + simpleDateFormatM14796a.format(date2);
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
        BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet)).setState(3);
    }
}
