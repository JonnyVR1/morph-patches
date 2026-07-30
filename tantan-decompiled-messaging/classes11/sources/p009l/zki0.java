package p009l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p000p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p1.mobile.putong.core.data.GPTopicCard;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zki0 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<GPTopicCard> f23723a;

    public zki0(FragmentManager fragmentManager, List<GPTopicCard> list) {
        super(fragmentManager);
        this.f23723a = list;
    }

    public int getCount() {
        return this.f23723a.size();
    }

    @NonNull
    public Fragment getItem(int i) {
        TopicUsersListFrag topicUsersListFrag = new TopicUsersListFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("type_topic_name", (Serializable) this.f23723a.get(i));
        topicUsersListFrag.setArguments(bundle);
        return topicUsersListFrag;
    }

    /* JADX INFO: renamed from: j */
    public void m25851j(List<GPTopicCard> list) {
        this.f23723a.clear();
        this.f23723a.addAll(list);
        notifyDataSetChanged();
    }
}
