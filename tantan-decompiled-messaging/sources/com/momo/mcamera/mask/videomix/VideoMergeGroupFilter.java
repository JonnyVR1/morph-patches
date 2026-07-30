package com.momo.mcamera.mask.videomix;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.FileUtil;
import com.momo.mcamera.mask.Sticker;
import java.io.File;
import p149l.cn40;
import p149l.etf;
import p149l.pjw;
import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class VideoMergeGroupFilter extends ydk implements etf, IVideoResourceInputListener.RenderTimestampListener, OnFaceUpdateListener {
    private long duration;
    private FaceCutFilter faceCutFilter;
    private IVideoTimeoutListener listener;
    private cn40 normalFilter;
    private long startTime;
    private VideoMaskFilter videoMaskFilter;
    private VideoMergeFilter videoMergeFilter;
    private VideoResourceFilter videoResourceFilter;
    private long videoTimestamp = -1;

    public VideoMergeGroupFilter(Context context, String str, Sticker.VideoFileConfig videoFileConfig, long j) {
        this.duration = 0L;
        this.startTime = 0L;
        this.useCache = false;
        cn40 cn40Var = new cn40();
        this.normalFilter = cn40Var;
        cn40Var.useCache = false;
        FaceCutFilter faceCutFilter = new FaceCutFilter();
        this.faceCutFilter = faceCutFilter;
        faceCutFilter.useCache = false;
        faceCutFilter.setOnVertexCoordinateUpdateListener(this);
        VideoResourceFilter videoResourceFilter = new VideoResourceFilter(context, str + File.separator + videoFileConfig.getVideo(), videoFileConfig.getFrameRateToPlay());
        this.videoResourceFilter = videoResourceFilter;
        videoResourceFilter.useCache = false;
        videoResourceFilter.setRenderTimestampListener(this);
        VideoMaskFilter videoMaskFilter = new VideoMaskFilter();
        this.videoMaskFilter = videoMaskFilter;
        videoMaskFilter.useCache = false;
        VideoMergeFilter videoMergeFilter = new VideoMergeFilter();
        this.videoMergeFilter = videoMergeFilter;
        videoMergeFilter.useCache = false;
        this.normalFilter.addTarget(this.faceCutFilter);
        this.normalFilter.addTarget(this.videoResourceFilter);
        this.normalFilter.addTarget(this.videoMaskFilter);
        this.videoMergeFilter.registerFilterLocation(this.faceCutFilter, 0);
        this.videoMergeFilter.registerFilterLocation(this.videoResourceFilter, 1);
        this.videoMergeFilter.registerFilterLocation(this.videoMaskFilter, 2);
        this.faceCutFilter.addTarget(this.videoMergeFilter);
        this.videoResourceFilter.addTarget(this.videoMergeFilter);
        this.videoMaskFilter.addTarget(this.videoMergeFilter);
        this.videoMergeFilter.addTarget(this);
        registerInitialFilter(this.normalFilter);
        registerFilter(this.faceCutFilter);
        registerFilter(this.videoResourceFilter);
        registerFilter(this.videoMaskFilter);
        registerTerminalFilter(this.videoMergeFilter);
        setVideoFileConfig(str, videoFileConfig);
        this.duration = j <= 0 ? Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS : j;
        this.startTime = System.currentTimeMillis();
    }

    private void setVideoFileConfig(String str, Sticker.VideoFileConfig videoFileConfig) {
        if (videoFileConfig == null || !FileUtil.exist(str)) {
            return;
        }
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.setVideoFileConfig(videoFileConfig.getTimeStamp(), videoFileConfig.getFaceData());
        }
        VideoMaskFilter videoMaskFilter = this.videoMaskFilter;
        if (videoMaskFilter != null) {
            videoMaskFilter.setVideoFileConfig(videoFileConfig.getMaskBorder(), str + File.separator + videoFileConfig.getMaskImage());
        }
        if (this.videoMaskFilter != null) {
            this.videoMergeFilter.setVideoFileConfig(videoFileConfig.getType());
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        this.faceCutFilter.setOnVertexCoordinateUpdateListener(null);
        this.videoResourceFilter.setRenderTimestampListener(null);
        this.videoTimestamp = -1L;
    }

    @Override // com.momo.mcamera.mask.videomix.OnFaceUpdateListener
    public void onFaceUpdate(float[] fArr, float f) {
        VideoMaskFilter videoMaskFilter = this.videoMaskFilter;
        if (videoMaskFilter != null) {
            videoMaskFilter.updateVertexCoordinate(fArr);
            this.videoMaskFilter.updateMaskRoll(f);
        }
    }

    @Override // com.momo.mcamera.mask.videomix.IVideoResourceInputListener.RenderTimestampListener
    public void onRenderTimestampChanged(long j) {
        if (System.currentTimeMillis() - this.startTime > this.duration) {
            IVideoTimeoutListener iVideoTimeoutListener = this.listener;
            if (iVideoTimeoutListener != null) {
                iVideoTimeoutListener.onTimeout();
                return;
            }
            return;
        }
        this.videoTimestamp = j;
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.updateTimestamp(j);
        }
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (this.videoTimestamp <= 0) {
            return;
        }
        VideoMergeFilter videoMergeFilter = this.videoMergeFilter;
        if (videoMergeFilter != null) {
            videoMergeFilter.setMMCVInfo(pjwVar);
        }
        FaceCutFilter faceCutFilter = this.faceCutFilter;
        if (faceCutFilter != null) {
            faceCutFilter.setMMCVInfo(pjwVar);
        }
    }

    public void setOnVideoTimeoutListener(IVideoTimeoutListener iVideoTimeoutListener) {
        this.listener = iVideoTimeoutListener;
    }
}
