package com.momo.mcamera.mask.hotdance;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import p153l.lt2;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes8.dex */
public class HotDanceFilter extends lt2 implements Handler.Callback {
    private final DanceNineGridFilter danceNineGridFilter;
    private final DanceOffsetFilter danceOffsetFilter;
    private final DanceScaleFilter danceScaleFilter;
    private final DanceSoulFilter danceSoulFilter;
    private final DanceTranslateFilter danceTranslateFilter;
    private Handler handler;
    private List<FilterOptions.HotDanceBean> hotDance;
    private int count = 0;
    private int index = 0;
    private final Runnable runnable = new Runnable() { // from class: com.momo.mcamera.mask.hotdance.HotDanceFilter.1
        @Override // java.lang.Runnable
        public void run() {
            HotDanceFilter.this.clear();
        }
    };

    public HotDanceFilter() {
        DanceSoulFilter danceSoulFilter = new DanceSoulFilter();
        this.danceSoulFilter = danceSoulFilter;
        DanceTranslateFilter danceTranslateFilter = new DanceTranslateFilter();
        this.danceTranslateFilter = danceTranslateFilter;
        DanceOffsetFilter danceOffsetFilter = new DanceOffsetFilter();
        this.danceOffsetFilter = danceOffsetFilter;
        DanceScaleFilter danceScaleFilter = new DanceScaleFilter();
        this.danceScaleFilter = danceScaleFilter;
        DanceNineGridFilter danceNineGridFilter = new DanceNineGridFilter();
        this.danceNineGridFilter = danceNineGridFilter;
        danceSoulFilter.addTarget(danceTranslateFilter);
        danceTranslateFilter.addTarget(danceOffsetFilter);
        danceOffsetFilter.addTarget(danceScaleFilter);
        danceScaleFilter.addTarget(danceNineGridFilter);
        danceNineGridFilter.addTarget(this);
        registerInitialFilter(danceSoulFilter);
        registerFilter(danceTranslateFilter);
        registerFilter(danceOffsetFilter);
        registerFilter(danceScaleFilter);
        registerTerminalFilter(danceNineGridFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        DanceNineGridFilter danceNineGridFilter = this.danceNineGridFilter;
        if (danceNineGridFilter != null) {
            danceNineGridFilter.clear();
        }
        DanceScaleFilter danceScaleFilter = this.danceScaleFilter;
        if (danceScaleFilter != null) {
            danceScaleFilter.clear();
        }
        DanceOffsetFilter danceOffsetFilter = this.danceOffsetFilter;
        if (danceOffsetFilter != null) {
            danceOffsetFilter.clear();
        }
        DanceTranslateFilter danceTranslateFilter = this.danceTranslateFilter;
        if (danceTranslateFilter != null) {
            danceTranslateFilter.clear();
        }
        DanceSoulFilter danceSoulFilter = this.danceSoulFilter;
        if (danceSoulFilter != null) {
            danceSoulFilter.clear();
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    private void driveEffect(Message message) {
        int i = message.what;
        if (i == 0) {
            this.danceScaleFilter.onMusicBeatDetect(i);
            return;
        }
        if (i == 1) {
            this.danceNineGridFilter.onMusicBeatDetect(i);
            return;
        }
        if (i == 2) {
            this.danceNineGridFilter.onMusicBeatDetect(i);
            return;
        }
        if (i == 3) {
            this.danceScaleFilter.onMusicBeatDetect(i);
            return;
        }
        if (i == 4) {
            this.danceScaleFilter.onMusicBeatDetect(i);
            return;
        }
        if (i == 5) {
            this.danceOffsetFilter.onMusicBeatDetect();
        } else if (i == 6) {
            this.danceTranslateFilter.onMusicBeatDetect();
        } else if (i == 7) {
            this.danceSoulFilter.onMusicBeatDetect();
        }
    }

    @Override // p153l.lt2, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(this.runnable);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        driveEffect(message);
        Message messageObtainMessage = this.handler.obtainMessage();
        int i = this.index + 1;
        this.index = i;
        int i2 = i % this.count;
        this.index = i2;
        messageObtainMessage.what = HotDanceConfig.unwrap(this.hotDance.get(i2).getName());
        this.handler.sendMessageDelayed(messageObtainMessage, (long) (this.hotDance.get(this.index).getInterval() * 1000.0f));
        return true;
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        if (filterOptions.getHotDance() == null || filterOptions.getHotDance().size() <= 0) {
            return;
        }
        List<FilterOptions.HotDanceBean> hotDance = filterOptions.getHotDance();
        this.hotDance = hotDance;
        this.count = hotDance.size();
        int iUnwrap = HotDanceConfig.unwrap(this.hotDance.get(this.index).getName());
        float interval = this.hotDance.get(this.index).getInterval() * 1000.0f;
        Handler handler = new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), this);
        this.handler = handler;
        handler.sendEmptyMessageDelayed(iUnwrap, (long) interval);
    }
}
