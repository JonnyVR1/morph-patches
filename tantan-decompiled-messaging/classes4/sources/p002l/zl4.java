package p002l;

import android.content.Context;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.data.RelationshipStatus;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zl4 extends vi90 {
    public zl4(Context context, mm90 mm90Var) {
        super(context, new zye());
        Bundle bundle = new Bundle();
        bundle.putString(SysnotifListener.KEY_USER_ID, mm90Var.f15456a);
        bundle.putBoolean("is_edit", mm90Var.f15458c);
        bundle.putString("input_type", mm90Var.f15459d);
        bundle.putBoolean("show_buttons", mm90Var.f15457b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f15467l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f15465j);
        bundle.putString("from", mm90Var.f15460e);
        bundle.putBoolean("open_media_picker", mm90Var.f15461f);
        RelationshipStatus relationshipStatus = mm90Var.f15462g;
        if (relationshipStatus != null) {
            bundle.putString("relationship_status", relationshipStatus.toString());
        }
        bundle.putInt("button_flag", mm90Var.f15463h);
        bundle.putBoolean("with_superlike", mm90Var.f15464i);
        bundle.putInt("pic_index", mm90Var.f15468m);
        bundle.putInt("pushReason", mm90Var.f15470o);
        bundle.putString("pushTag", mm90Var.f15471p);
        bundle.putSerializable("city_centre_data", mm90Var.f15472q);
        m23982d(bundle);
    }
}
