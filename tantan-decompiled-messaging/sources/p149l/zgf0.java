package p149l;

import android.content.Context;
import com.wdullaer.materialdatetimepicker.date.AbstractC14669b;
import com.wdullaer.materialdatetimepicker.date.InterfaceC14668a;
import com.wdullaer.materialdatetimepicker.date.MonthView;
import com.wdullaer.materialdatetimepicker.date.SimpleMonthView;

/* JADX INFO: loaded from: classes2.dex */
public class zgf0 extends AbstractC14669b {
    public zgf0(Context context, InterfaceC14668a interfaceC14668a) {
        super(context, interfaceC14668a);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.AbstractC14669b
    /* JADX INFO: renamed from: b */
    public MonthView mo85152b(Context context) {
        return new SimpleMonthView(context, null, this.f61320b);
    }
}
