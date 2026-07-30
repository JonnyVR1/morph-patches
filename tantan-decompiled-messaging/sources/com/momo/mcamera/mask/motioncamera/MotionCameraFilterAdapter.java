package com.momo.mcamera.mask.motioncamera;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.cosmos.mdlog.MDLog;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import p149l.pjw;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes7.dex */
public class MotionCameraFilterAdapter implements MotionCameraFilterJob.IMotionFilterJobListener {
    public static final String MotionFilterTAG = "MotionFilter";
    private MotionCameraFilterJob currentJob;
    private int height;
    private OnCropRegionChangedListener listener;
    private pjw mmcvInfo;
    private pjw scaleMMCVInfo;
    private int width;
    private int START_MOVE_WHAT = 4352;
    private LinkedList<MotionCameraFilterJob> jobQueue = new LinkedList<>();
    private PointF lastCropCenterPoint = new PointF(0.5f, 0.5f);
    private float currentScale = 1.0f;
    private boolean hasFace = false;
    private float moCamPushDuration = 1.0f;
    private float moCamPullDuration = 1.0f;
    private float moCamScale = 0.9f;
    private int moCam_T = 2;
    private int moCam_t0 = 2;
    private int moCam_CD = 0;
    private int moCam_Cnt = 8;
    private int moCam_moveT = 8;
    private int moveLoopInterval = 8;
    private boolean canMove = true;
    private int currentMoveCount = 0;
    private MotionMoveJob motionMoveJob = new MotionMoveJob();
    private Timer canMoveTimer = new Timer();
    private Timer whileLoopTimer = new Timer();
    private Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.momo.mcamera.mask.motioncamera.MotionCameraFilterAdapter.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == MotionCameraFilterAdapter.this.START_MOVE_WHAT) {
                MDLog.m7389d(MotionCameraFilterAdapter.MotionFilterTAG, "移动move Job , 处理消息, isJobMoveRunning=" + MotionCameraFilterAdapter.this.isJobMoveRunning());
                if (MotionCameraFilterAdapter.this.mmcvInfo == null || MotionCameraFilterAdapter.this.mmcvInfo.m169950n() <= 0 || MotionCameraFilterAdapter.this.isJobMoveRunning() || MotionCameraFilterAdapter.this.currentMoveCount > MotionCameraFilterAdapter.this.moCam_Cnt) {
                    return;
                }
                MDLog.m7389d(MotionCameraFilterAdapter.MotionFilterTAG, "移动move Job , currentMoveCount=" + MotionCameraFilterAdapter.this.currentMoveCount + ", moCam_Cnt=" + MotionCameraFilterAdapter.this.moCam_Cnt);
                MotionCameraFilterAdapter motionCameraFilterAdapter = MotionCameraFilterAdapter.this;
                motionCameraFilterAdapter.move(motionCameraFilterAdapter.mmcvInfo);
            }
        }
    };

    public interface OnCropRegionChangedListener {
        void onCropRegionChanged(float f, float f2, float f3, float f4);
    }

    public MotionCameraFilterAdapter(OnCropRegionChangedListener onCropRegionChangedListener) {
        this.listener = onCropRegionChangedListener;
    }

    private RectF calculateCropRegion(float f, float f2, float f3, float f4) {
        float f5 = f3 * 0.5f;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f4 * 0.5f;
        float f9 = f2 - f8;
        float f10 = f2 + f8;
        if (f6 < 0.0f) {
            f7 += 0.0f - f6;
            f6 = 0.0f;
        } else {
            int i = this.width;
            if (f7 > i) {
                f6 -= f7 - i;
                f7 = i;
            }
        }
        if (f9 < 0.0f) {
            f10 += 0.0f - f9;
            f9 = 0.0f;
        } else {
            int i2 = this.height;
            if (f10 > i2) {
                f9 -= f10 - i2;
                f10 = i2;
            }
        }
        int i3 = this.width;
        int i4 = this.height;
        RectF rectF = new RectF(f6 / i3, f9 / i4, f7 / i3, f10 / i4);
        if (rectF.left < 0.001f) {
            rectF.left = 0.0f;
        }
        if (rectF.top < 0.001f) {
            rectF.top = 0.0f;
        }
        if (rectF.right < 0.001f) {
            rectF.right = 0.0f;
        }
        if (rectF.bottom < 0.001f) {
            rectF.bottom = 0.0f;
        }
        return rectF;
    }

    private void cancelJobs() {
        this.jobQueue.clear();
        this.motionMoveJob.cancel();
        MotionCameraFilterJob motionCameraFilterJob = this.currentJob;
        if (motionCameraFilterJob == null || !motionCameraFilterJob.isRunning()) {
            return;
        }
        this.currentJob.cancel();
    }

    private void cancelTimer() {
        this.canMoveTimer.purge();
        this.canMoveTimer.cancel();
        this.whileLoopTimer.purge();
        this.whileLoopTimer.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isJobMoveRunning() {
        MotionCameraFilterJob motionCameraFilterJob = this.currentJob;
        return (motionCameraFilterJob != null && motionCameraFilterJob.isRunning()) || this.motionMoveJob.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void move(pjw pjwVar) {
        MDLog.m7389d(MotionFilterTAG, "move,   currentScale=" + this.currentScale);
        float[] fArrM220014e = pjwVar.m169946j(0).m220014e();
        float f = (fArrM220014e[2] + fArrM220014e[0]) * 0.5f;
        float f2 = (fArrM220014e[3] + fArrM220014e[1]) * 0.5f;
        float f3 = this.width;
        float f4 = this.currentScale;
        float f5 = f3 * f4;
        float f6 = this.height * f4;
        PointF pointF = this.lastCropCenterPoint;
        RectF rectFCalculateCropRegion = calculateCropRegion(pointF.x, pointF.y, f5, f6);
        PointF pointF2 = this.lastCropCenterPoint;
        pointF2.x = f;
        pointF2.y = f2;
        RectF rectFCalculateCropRegion2 = calculateCropRegion(f, f2, f5, f6);
        this.motionMoveJob.setCropRegionChangedListener(this.listener);
        this.motionMoveJob.start(this.moCam_t0, rectFCalculateCropRegion, rectFCalculateCropRegion2);
        this.currentMoveCount++;
    }

    private void releaseCallbacks() {
        this.listener = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    public boolean addJob(MotionCameraFilterJob motionCameraFilterJob) {
        MotionCameraFilterJob motionCameraFilterJob2 = this.currentJob;
        if (motionCameraFilterJob2 != null && motionCameraFilterJob2.isRunning()) {
            return false;
        }
        this.jobQueue.addLast(motionCameraFilterJob);
        return true;
    }

    @Override // com.momo.mcamera.mask.motioncamera.MotionCameraFilterJob.IMotionFilterJobListener
    public void onJobEnd() {
    }

    @Override // com.momo.mcamera.mask.motioncamera.MotionCameraFilterJob.IMotionFilterJobListener
    public void onScaleChanged(float f) {
        float f2;
        float f3;
        MDLog.m7389d(MotionFilterTAG, "onScaleChanged , 镜头收缩开始的时候回调， scale=" + f + ", width=" + this.width + ", height=" + this.height);
        this.currentScale = f;
        if (this.width == 0 || this.height == 0) {
            return;
        }
        pjw pjwVar = this.scaleMMCVInfo;
        if (pjwVar == null || pjwVar.m169950n() <= 0) {
            PointF pointF = this.lastCropCenterPoint;
            f2 = pointF.x;
            f3 = pointF.y;
        } else {
            float[] fArrM220014e = this.scaleMMCVInfo.m169946j(0).m220014e();
            f2 = (fArrM220014e[2] + fArrM220014e[0]) * 0.5f;
            f3 = (fArrM220014e[3] + fArrM220014e[1]) * 0.5f;
            PointF pointF2 = this.lastCropCenterPoint;
            pointF2.x = f2;
            pointF2.y = f3;
        }
        RectF rectFCalculateCropRegion = calculateCropRegion(f2, f3, this.width * f, this.height * f);
        OnCropRegionChangedListener onCropRegionChangedListener = this.listener;
        if (onCropRegionChangedListener != null) {
            onCropRegionChangedListener.onCropRegionChanged(rectFCalculateCropRegion.left, rectFCalculateCropRegion.top, rectFCalculateCropRegion.right, rectFCalculateCropRegion.bottom);
        }
    }

    public void release() {
        cancelTimer();
        cancelJobs();
        releaseCallbacks();
    }

    public void setFilterOptions(FilterOptions filterOptions) {
        this.moCamPushDuration = filterOptions.getMoCamPushDuration();
        this.moCamPullDuration = filterOptions.getMoCamPullDuration();
        this.moCamScale = filterOptions.getMoCamScale();
        this.moCam_T = filterOptions.getMoCam_T();
        this.moCam_t0 = filterOptions.getMoCam_t0();
        this.moCam_CD = filterOptions.getMoCam_CD();
        this.moCam_Cnt = filterOptions.getMoCam_Cnt();
        int moCam_moveT = filterOptions.getMoCam_moveT();
        this.moCam_moveT = moCam_moveT;
        this.moveLoopInterval = moCam_moveT - this.moCam_CD;
        startTimer();
    }

    public void startTimer() {
        Timer timer = this.whileLoopTimer;
        TimerTask timerTask = new TimerTask() { // from class: com.momo.mcamera.mask.motioncamera.MotionCameraFilterAdapter.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                MDLog.m7389d(MotionCameraFilterAdapter.MotionFilterTAG, "大周期时间到了，状态重置，开启运动. moveLoopInterval=" + MotionCameraFilterAdapter.this.moveLoopInterval + ", moCam_moveT=" + MotionCameraFilterAdapter.this.moCam_moveT);
                MotionCameraFilterAdapter.this.currentMoveCount = 0;
                MotionCameraFilterAdapter.this.canMove = true;
                if (MotionCameraFilterAdapter.this.moveLoopInterval < MotionCameraFilterAdapter.this.moCam_moveT) {
                    MotionCameraFilterAdapter.this.canMoveTimer.purge();
                    MotionCameraFilterAdapter.this.canMoveTimer.schedule(new TimerTask() { // from class: com.momo.mcamera.mask.motioncamera.MotionCameraFilterAdapter.2.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            MDLog.m7389d(MotionCameraFilterAdapter.MotionFilterTAG, "运动上线时间到了，关闭运动.");
                            MotionCameraFilterAdapter.this.canMove = false;
                            MotionCameraFilterAdapter.this.jobQueue.clear();
                            if (MotionCameraFilterAdapter.this.currentJob != null && MotionCameraFilterAdapter.this.currentJob.isRunning()) {
                                MotionCameraFilterAdapter.this.currentJob.cancel();
                            }
                            if (MotionCameraFilterAdapter.this.currentScale <= 0.99f) {
                                MDLog.m7389d(MotionCameraFilterAdapter.MotionFilterTAG, "运动上线时间到了，关闭运动.强制做一个收镜动作");
                                MotionCameraFilterAdapter motionCameraFilterAdapter = MotionCameraFilterAdapter.this;
                                motionCameraFilterAdapter.scaleMMCVInfo = motionCameraFilterAdapter.mmcvInfo;
                                MotionCameraFilterJob motionCameraFilterJob = new MotionCameraFilterJob(MotionCameraFilterAdapter.this.moCamPullDuration, MotionCameraFilterAdapter.this.moCamScale, 1.0f);
                                motionCameraFilterJob.setMotionFilterJobListener(MotionCameraFilterAdapter.this);
                                motionCameraFilterJob.start();
                                MotionCameraFilterAdapter.this.hasFace = false;
                            }
                        }
                    }, MotionCameraFilterAdapter.this.moveLoopInterval * 1000);
                }
            }
        };
        int i = this.moCam_moveT;
        timer.schedule(timerTask, i * 1000, i * 1000);
    }

    public void updateMMCVInfo(pjw pjwVar, int i, int i2) {
        this.mmcvInfo = pjwVar;
        this.width = i;
        this.height = i2;
        if (!this.canMove) {
            MDLog.m7389d(MotionFilterTAG, "被禁止运动了.return.");
            return;
        }
        int iM169950n = pjwVar.m169950n();
        boolean z = this.hasFace;
        if (iM169950n > 0) {
            if (!z && this.jobQueue.isEmpty()) {
                MDLog.m7389d(MotionFilterTAG, "addJob ,有人脸，且之前也没人脸（人脸出现时）");
                this.hasFace = addJob(new MotionCameraFilterJob(this.moCamPushDuration, 1.0f, this.moCamScale));
            }
        } else if (z && this.jobQueue.isEmpty()) {
            MDLog.m7389d(MotionFilterTAG, "addJob ,没人脸，且之前有人脸（人脸消失时）");
            this.hasFace = !addJob(new MotionCameraFilterJob(this.moCamPullDuration, this.moCamScale, 1.0f));
        }
        MDLog.m7389d(MotionFilterTAG, "允许运动, jobQueue.isEmpty()=" + this.jobQueue.isEmpty() + ", isJobMoveRunning()=" + isJobMoveRunning() + ", hasMessages=" + this.handler.hasMessages(this.START_MOVE_WHAT));
        if (!this.jobQueue.isEmpty() && !isJobMoveRunning() && this.currentMoveCount <= this.moCam_Cnt) {
            this.scaleMMCVInfo = pjwVar;
            MotionCameraFilterJob motionCameraFilterJobPop = this.jobQueue.pop();
            this.currentJob = motionCameraFilterJobPop;
            motionCameraFilterJobPop.setMotionFilterJobListener(this);
            this.currentJob.start();
            MDLog.m7389d(MotionFilterTAG, "执行伸缩镜头Job , currentMoveCount=" + this.currentMoveCount + ", limitMoveCount=" + this.moCam_Cnt);
            this.currentMoveCount = this.currentMoveCount + 1;
        }
        if (this.handler.hasMessages(this.START_MOVE_WHAT)) {
            return;
        }
        this.handler.sendEmptyMessageDelayed(this.START_MOVE_WHAT, this.moCam_T * 1000);
    }
}
