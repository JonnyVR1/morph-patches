package p153l;

import android.content.Context;
import android.os.Bundle;
import com.p051p1.mobile.putong.data.RelationshipStatus;

/* JADX INFO: loaded from: classes4.dex */
public class ym4 extends zq90 {
    public ym4(Context context, qu90 qu90Var) {
        super(context, new d0f());
        Bundle bundle = new Bundle();
        bundle.putString("user_id", qu90Var.f159534a);
        bundle.putBoolean("is_edit", qu90Var.f159536c);
        bundle.putString("input_type", qu90Var.f159537d);
        bundle.putBoolean("show_buttons", qu90Var.f159535b);
        bundle.putBoolean("canShowFollowButton", qu90Var.f159545l);
        bundle.putBoolean("no_showbuttons_infofromlocal", qu90Var.f159543j);
        bundle.putString("from", qu90Var.f159538e);
        bundle.putBoolean("open_media_picker", qu90Var.f159539f);
        RelationshipStatus relationshipStatus = qu90Var.f159540g;
        if (relationshipStatus != null) {
            bundle.putString("relationship_status", relationshipStatus.toString());
        }
        bundle.putInt("button_flag", qu90Var.f159541h);
        bundle.putBoolean("with_superlike", qu90Var.f159542i);
        bundle.putInt("pic_index", qu90Var.f159546m);
        bundle.putInt("pushReason", qu90Var.f159548o);
        bundle.putString("pushTag", qu90Var.f159549p);
        bundle.putSerializable("city_centre_data", qu90Var.f159550q);
        m220977d(bundle);
    }
}
