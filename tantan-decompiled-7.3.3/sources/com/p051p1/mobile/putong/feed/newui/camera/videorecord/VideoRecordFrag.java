package com.p051p1.mobile.putong.feed.newui.camera.videorecord;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.xgl0;
import p153l.yil0;

/* JADX INFO: loaded from: classes13.dex */
public class VideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public yil0 f40372A;

    /* JADX INFO: renamed from: z */
    public xgl0 f40373z;

    /* JADX INFO: renamed from: M4 */
    public static void m62592M4(VideoRecordFrag videoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
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

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40372A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        if (NullChecker.m82486a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m62593o() {
        this.f40372A.m216309j1();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f40372A.m216296V2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
        if (!TextUtils.equals(this.f40372A.f200130L0, "my_states") || intent == null || (arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h)) == null || (arrayList.get(0) instanceof Video)) {
            return;
        }
        act().startActivity(FeedPostStatusAct.m66991v2(act(), arrayList));
        act().m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40373z = new xgl0(this);
        yil0 yil0Var = new yil0(this);
        this.f40372A = yil0Var;
        this.f40373z.mo52715C(yil0Var);
        this.f40373z.m210922m0(getArguments());
    }
}
