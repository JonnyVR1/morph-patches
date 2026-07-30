package p149l;

import android.content.Context;
import android.os.Bundle;
import com.p046p1.mobile.putong.data.RelationshipStatus;

/* JADX INFO: loaded from: classes4.dex */
public class zl4 extends vi90 {
    public zl4(Context context, mm90 mm90Var) {
        super(context, new zye());
        Bundle bundle = new Bundle();
        bundle.putString("user_id", mm90Var.f134562a);
        bundle.putBoolean("is_edit", mm90Var.f134564c);
        bundle.putString("input_type", mm90Var.f134565d);
        bundle.putBoolean("show_buttons", mm90Var.f134563b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f134573l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f134571j);
        bundle.putString("from", mm90Var.f134566e);
        bundle.putBoolean("open_media_picker", mm90Var.f134567f);
        RelationshipStatus relationshipStatus = mm90Var.f134568g;
        if (relationshipStatus != null) {
            bundle.putString("relationship_status", relationshipStatus.toString());
        }
        bundle.putInt("button_flag", mm90Var.f134569h);
        bundle.putBoolean("with_superlike", mm90Var.f134570i);
        bundle.putInt("pic_index", mm90Var.f134574m);
        bundle.putInt("pushReason", mm90Var.f134576o);
        bundle.putString("pushTag", mm90Var.f134577p);
        bundle.putSerializable("city_centre_data", mm90Var.f134578q);
        m198529d(bundle);
    }
}
