package p149l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zki0 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<GPTopicCard> f203544a;

    public zki0(FragmentManager fragmentManager, List<GPTopicCard> list) {
        super(fragmentManager);
        this.f203544a = list;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f203544a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        TopicUsersListFrag topicUsersListFrag = new TopicUsersListFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("type_topic_name", this.f203544a.get(i));
        topicUsersListFrag.setArguments(bundle);
        return topicUsersListFrag;
    }

    /* JADX INFO: renamed from: j */
    public void m219181j(List<GPTopicCard> list) {
        this.f203544a.clear();
        this.f203544a.addAll(list);
        notifyDataSetChanged();
    }
}
