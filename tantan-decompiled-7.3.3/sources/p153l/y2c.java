package p153l;

import com.p051p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class y2c implements Comparator<LongLinkLiveDanmakuMessage.BulletCommentInfo> {

    /* JADX INFO: renamed from: a */
    public final List<LongLinkLiveDanmakuMessage.BulletCommentInfo> f197203a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f197204b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    public volatile LongLinkLiveDanmakuMessage.BulletCommentInfo f197205c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f197206d;

    /* JADX INFO: renamed from: a */
    public void m214050a(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f197204b.lock();
        if (this.f197206d) {
            m214053d();
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        if (this.f197205c != null && bulletCommentInfo.getVideoLiveBulletComment().getPriority() < this.f197205c.getVideoLiveBulletComment().getPriority()) {
            LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2 = this.f197205c;
            this.f197205c = bulletCommentInfo;
            this.f197203a.add(0, bulletCommentInfo2);
            bulletCommentInfo.getMasks(0).getOriginUserId();
            bulletCommentInfo.getVideoLiveBulletComment().getContent();
            Thread.currentThread().getName();
            this.f197204b.unlock();
            return;
        }
        this.f197203a.add(bulletCommentInfo);
        Collections.sort(this.f197203a, this);
        if (this.f197203a.size() > 1000) {
            List<LongLinkLiveDanmakuMessage.BulletCommentInfo> list = this.f197203a;
            list.remove(list.size() - 1);
        }
        if (this.f197205c == null) {
            this.f197205c = this.f197203a.remove(0);
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f197204b.unlock();
    }

    /* JADX INFO: renamed from: b */
    public void m214051b() {
        if (!this.f197204b.tryLock()) {
            this.f197206d = true;
        } else {
            m214053d();
            this.f197204b.unlock();
        }
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2) {
        return (int) (bulletCommentInfo.getVideoLiveBulletComment().getPriority() - bulletCommentInfo2.getVideoLiveBulletComment().getPriority());
    }

    /* JADX INFO: renamed from: d */
    public final void m214053d() {
        this.f197203a.clear();
        this.f197205c = null;
        this.f197206d = false;
        hashCode();
    }

    /* JADX INFO: renamed from: e */
    public LongLinkLiveDanmakuMessage.BulletCommentInfo m214054e() {
        if (!this.f197204b.tryLock()) {
            Thread.currentThread().getName();
            return null;
        }
        if (this.f197206d) {
            m214053d();
            this.f197204b.unlock();
            Thread.currentThread().getName();
            return null;
        }
        if (this.f197205c == null) {
            Thread.currentThread().getName();
            this.f197204b.unlock();
            return null;
        }
        LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo = this.f197205c;
        if (this.f197203a.size() > 0) {
            this.f197205c = this.f197203a.remove(0);
        } else {
            this.f197205c = null;
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f197204b.unlock();
        return bulletCommentInfo;
    }
}
