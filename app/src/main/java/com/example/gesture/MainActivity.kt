package com.example.gesture

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.XMLFormatter
import androidx.core.view.MotionEventCompat as MotionEventCompat1

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)
    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun  onDown(event: MotionEvent) : Boolean {
        Gesture_status.text = "onDown"
        return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
       Gesture_status.text = "onFling"
        return true

    }
    override fun onLongPress (event: MotionEvent) {
        Gesture_status.text = "onLongPress"
    }
    override fun onScroll (e1: MotionEvent, e2: MotionEvent,
        distanceX: Float, distanceY: Float) : Boolean {
        Gesture_status.text = "onScroll"
        return true
    }

    override fun onShowPress (event: MotionEvent) {
        Gesture_status.text = "onShowPress"
    }

    override fun onSingleTapUp(event: MotionEvent): Boolean {
        Gesture_status.text = "onSingleTapUp"
        return true
    }
    override fun onDoubleTap(event: MotionEvent) : Boolean {
        Gesture_status.text = "onDoubleTap"
        return true
    }
    override fun onDoubleTapEvent (event: MotionEvent) : Boolean{
        Gesture_status.text = "onDoubleTapEvent"
        return true
    }

    override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
        Gesture_status.text = "onSingleTapConfirmed"
        return true
    }
}
