package com.p046p1.mobile.putong.feed.newui.camera.videorecord;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.t7l0;
import p149l.u9l0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public u9l0 f39524A;

    /* JADX INFO: renamed from: z */
    public t7l0 f39525z;

    /* JADX INFO: renamed from: M4 */
    public static void m61408M4(VideoRecordFrag videoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
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

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f39524A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        if (NullChecker.m81303a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m61409o() {
        this.f39524A.m192537j1();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f39524A.m192524V2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
        if (!TextUtils.equals(this.f39524A.f175375L0, "my_states") || intent == null || (arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h)) == null || (arrayList.get(0) instanceof Video)) {
            return;
        }
        act().startActivity(FeedPostStatusAct.m65808u2(act(), arrayList));
        act().m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39525z = new t7l0(this);
        u9l0 u9l0Var = new u9l0(this);
        this.f39524A = u9l0Var;
        this.f39525z.mo51532C(u9l0Var);
        this.f39525z.m187483m0(getArguments());
    }
}
