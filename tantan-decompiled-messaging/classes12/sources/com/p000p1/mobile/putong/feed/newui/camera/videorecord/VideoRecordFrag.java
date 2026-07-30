package com.p000p1.mobile.putong.feed.newui.camera.videorecord;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p007l.t7l0;
import p007l.u9l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public u9l0 f985A;

    /* JADX INFO: renamed from: z */
    public t7l0 f986z;

    /* JADX INFO: renamed from: M4 */
    public static void m2357M4(VideoRecordFrag videoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_music_content", musicContent);
        bundle.putBoolean("extra_has_video", z);
        bundle.putBoolean("extra_is_add_image", z2);
        bundle.putInt("extra_image_count", i);
        bundle.putString("extra_from", str);
        bundle.putBoolean("extra_show_only_photo", z3);
        bundle.putSerializable("extra_selected_images", arrayList);
        bundle.putString("extra_selected_folder_path", str2);
        videoRecordFrag.setArguments(bundle);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f985A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m2358n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        if (NullChecker.a(getActivity().getSupportActionBar())) {
            getActivity().getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2359o() {
        this.f985A.m15044j1();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f985A.m15030V2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
        if (!TextUtils.equals(this.f985A.f13697L0, "my_states") || intent == null || (arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h)) == null || (arrayList.get(0) instanceof Video)) {
            return;
        }
        act().startActivity(FeedPostStatusAct.m6954u2(act(), arrayList));
        act().finish();
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        this.f986z = new t7l0(this);
        u9l0 u9l0Var = new u9l0(this);
        this.f985A = u9l0Var;
        this.f986z.C(u9l0Var);
        this.f986z.m14475m0(getArguments());
    }
}
