package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class arp {
    /* JADX INFO: renamed from: a */
    public static void m99765a(zqp zqpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zqpVar.f205644x = viewGroup.getChildAt(0);
        zqpVar.f205645y = (LinearLayout) viewGroup.getChildAt(1);
        zqpVar.f205646z = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zqpVar.f205638A = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zqpVar.f205639B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        zqpVar.f205640C = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        zqpVar.f205641D = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
