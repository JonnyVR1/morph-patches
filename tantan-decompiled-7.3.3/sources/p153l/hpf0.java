package p153l;

import android.content.Context;
import com.wdullaer.materialdatetimepicker.date.AbstractC14817b;
import com.wdullaer.materialdatetimepicker.date.InterfaceC14816a;
import com.wdullaer.materialdatetimepicker.date.MonthView;
import com.wdullaer.materialdatetimepicker.date.SimpleMonthView;

/* JADX INFO: loaded from: classes2.dex */
public class hpf0 extends AbstractC14817b {
    public hpf0(Context context, InterfaceC14816a interfaceC14816a) {
        super(context, interfaceC14816a);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.AbstractC14817b
    /* JADX INFO: renamed from: b */
    public MonthView mo86323b(Context context) {
        return new SimpleMonthView(context, null, this.f62167b);
    }
}
